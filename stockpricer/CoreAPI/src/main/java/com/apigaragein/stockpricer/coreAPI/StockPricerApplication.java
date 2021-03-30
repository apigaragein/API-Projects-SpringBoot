package com.apigaragein.stockpricer.coreAPI;

import com.apigaragein.stockpricer.coreAPI.controller.StockPricerController;
import com.apigaragein.stockpricer.coreAPI.repositories.StockPricerRepository;
import com.apigaragein.stockpricer.coreAPI.services.StockPricerService;
import com.apigaragein.stockpricer.services.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = StockPricerController.class)
@ComponentScan(basePackageClasses = StockPricerService.class)
@ComponentScan(basePackageClasses = StockPricerRepository.class)
public class StockPricerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockPricerApplication.class, args);
	}

}
