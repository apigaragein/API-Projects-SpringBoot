package com.apigarage.countrycurrency;

import com.apigarage.countrycurrency.controller.CountryCurrencyController;
import com.apigarage.countrycurrency.service.CountryCurrencyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackageClasses = CountryCurrencyController.class)
@ComponentScan(basePackageClasses = CountryCurrencyService.class)

public class CountryCurrencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryCurrencyApplication.class, args);
	}

}
