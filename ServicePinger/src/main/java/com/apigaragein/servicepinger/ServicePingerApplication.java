package com.apigaragein.servicepinger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ServicePingerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicePingerApplication.class, args);
	}

}
