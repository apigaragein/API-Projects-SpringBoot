package com.apigaragein.servicepinger.component;

import com.apigaragein.servicepinger.config.ServicePingerConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class ServicePingerComponent {

    final static Logger logger= LoggerFactory.getLogger("ServicePingerComponent.class");

    @Autowired
    ServicePingerConfig servicePingerConfig;

    @Scheduled(fixedRate = 6000)
    public void getStatus() throws IOException {
        String url = servicePingerConfig.getUrl();
        String result = getHttpStatus(url);
        logger.info("Ping Result :" + result );
    }


    public  String getHttpStatus(String url) throws IOException {

        String result = "";
        try {
            URL urlObj = new URL(url);
            logger.info("Pinging.... " + url);
            HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
            con.setRequestMethod("GET");
            con.setConnectTimeout(3000);
            con.connect();

            int code = con.getResponseCode();
            if (code == 200) {

                result = url + " is Up";
            }
        } catch (Exception e) {
            logger.info(e.toString());
            result = url + " service is down";
        }
        return result;
    }
}
