package com.apigarage.IPAPI;

import com.apigarage.IPAPI.controller.IPAPIGeoIPController;
import com.apigarage.IPAPI.service.IPAPIGeoIPService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = IPAPIGeoIPController.class)
@ComponentScan(basePackageClasses = IPAPIGeoIPService.class)
public class IpapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpapiApplication.class, args);
	}

}
