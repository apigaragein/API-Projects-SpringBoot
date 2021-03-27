package com.apigaragein.faangstockpriceanalysis;

import com.apigaragein.faangstockpriceanalysis.controller.FaangStockPriceAnalysisController;
import com.apigaragein.faangstockpriceanalysis.repositories.FaangStockPriceAnalysisRepository;
import com.apigaragein.faangstockpriceanalysis.services.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = FaangStockPriceAnalysisController.class)
@ComponentScan(basePackageClasses = FaangStockPriceAnalysisService.class)
@ComponentScan(basePackageClasses = FaangStockPriceAnalysisRepository.class)
public class FaangstockpriceanalysisApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaangstockpriceanalysisApplication.class, args);
	}

}
