package com.apigarage.IPAPI.service;

import com.apigarage.IPAPI.config.IPAPIGeoConfig;
import com.apigarage.IPAPI.model.IPAPIGeoIP;
import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAPIGeoIPService {
    private DatabaseReader dbReader;

    public IPAPIGeoIP getLocation(String ip)throws IOException, GeoIp2Exception{

        dbReader = IPAPIGeoConfig.getCityDBReader();

        InetAddress ipAddress = InetAddress.getByName(ip);
        CityResponse response = dbReader.city(ipAddress);


        String cityName = response.getCity().getName();
        String latitude =
                response.getLocation().getLatitude().toString();
        String longitude =
                response.getLocation().getLongitude().toString();
        String continent = response.getContinent().getName();
        String country = response.getCountry().getName();
        String timeZone = response.getLocation().getTimeZone();

        return new IPAPIGeoIP(ipAddress.getHostAddress(), cityName, latitude, longitude,continent,country,timeZone);
    }

    public String getIPAddress(String domainName) throws UnknownHostException {
        InetAddress ipAddress = InetAddress.getByName(domainName);
        return ipAddress.getHostAddress();
    }

}
