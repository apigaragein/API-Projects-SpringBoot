package com.apigaragein.companyapi.dao;

import com.apigaragein.companyapi.model.Company;
import com.apigaragein.companyapi.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyDao {

    @Autowired
    CompanyRepository companyRepository;

    public List<Company> getCompanyList(){
        return companyRepository.findAll();
    }

    public Company getCompanyById(String id){
        return companyRepository.getOne(id);
    }

    public void addCompany(Company company){
        companyRepository.save(company);
    }

    public void modifyCompany(Company company) {
        companyRepository.save(company);
    }

    public void deleteCompany(String companyID) {
        companyRepository.deleteById(companyID);
    }
}
