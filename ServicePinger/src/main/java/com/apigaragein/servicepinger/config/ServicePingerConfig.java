package com.apigaragein.servicepinger.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicePingerConfig {

    @Value("${ping.url}")
    private  String urlToPing;

    public  String getUrl(){
        return urlToPing;
    }
}
