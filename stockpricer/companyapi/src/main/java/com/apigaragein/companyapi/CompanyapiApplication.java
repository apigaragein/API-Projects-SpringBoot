package com.apigaragein.companyapi;

import com.apigaragein.companyapi.controller.CompanyController;
import com.apigaragein.companyapi.dao.CompanyDao;
import com.apigaragein.companyapi.repository.CompanyRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.apigaragein.companyapi")
public class CompanyapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyapiApplication.class, args);
	}

}
