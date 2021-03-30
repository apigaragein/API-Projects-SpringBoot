package com.apigaragein.companyapi.repository;

import com.apigaragein.companyapi.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  CompanyRepository extends JpaRepository<Company, String> {
}
