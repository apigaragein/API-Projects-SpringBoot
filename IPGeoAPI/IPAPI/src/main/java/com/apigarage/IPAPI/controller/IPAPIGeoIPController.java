package com.apigarage.IPAPI.controller;

import com.apigarage.IPAPI.model.IPAPIGeoIP;
import com.apigarage.IPAPI.service.IPAPIGeoIPService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class IPAPIGeoIPController {
    private final IPAPIGeoIPService locationService;

    public IPAPIGeoIPController() throws IOException {
        locationService = new IPAPIGeoIPService();
    }

    @PostMapping("/GeoIP")
    public IPAPIGeoIP getLocation(
            @RequestParam(value="ipAddress", required=true) String ipAddress
    ) throws Exception {
        return locationService.getLocation(ipAddress);
    }

    @PostMapping("/GetIP")
    public String getIP(
            @RequestParam(value="domainName", required=true) String domainName
    ) throws Exception {
        return locationService.getIPAddress(domainName);
    }
}