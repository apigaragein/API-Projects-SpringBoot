package com.apigaragein.companyapi.service;

import com.apigaragein.companyapi.dao.CompanyDao;
import com.apigaragein.companyapi.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyDao companyDao;

    public List<Company> getCompanyList(){
        return companyDao.getCompanyList();
    }

    public Company getCompanyById(String id){
        return companyDao.getCompanyById(id);
    }

    public String addCompany(Company company){
        try{
            companyDao.addCompany(company);
            return "Company Added Successfully.";
        }catch(Exception e){
            return e.getMessage();
        }

    }

    public String modifyCompany(Company company){
        try{
            companyDao.modifyCompany(company);
            return "Company Updated Successfully.";
        }catch(Exception e){
            return e.getMessage();
        }

    }
    public String deleteCompany(String companyID){
        try{
            companyDao.deleteCompany(companyID);
            return "Company Deleted Successfully.";
        }catch(Exception e){
            return e.getMessage();
        }

    }
}
