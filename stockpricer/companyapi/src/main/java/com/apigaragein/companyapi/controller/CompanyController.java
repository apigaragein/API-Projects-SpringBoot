package com.apigaragein.companyapi.controller;

import com.apigaragein.companyapi.model.Company;
import com.apigaragein.companyapi.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @GetMapping("/getAllCompanies")
    public Object getAllCompanies(){
        return companyService.getCompanyList();
    }

    @GetMapping("/getCompany")
    public Object getCompanyById(@RequestParam Map<String, String> companyParam){
        String companyID = companyParam.get("companyId");

         return companyService.getCompanyById(companyID);
    }

    @PostMapping("/addCompany")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> addCompany(@RequestParam Map<String, String> companyParam){
        String companyID = companyParam.get("companyID");
        String companyName = companyParam.get("companyname");
        String symbol = companyParam.get("symbol");
        String marketCap = companyParam.get("marketCap");
        String country = companyParam.get("country");
        String volume = companyParam.get("volume");
        String sector = companyParam.get("sector");
        String industry = companyParam.get("industry");
        Company company = new Company( companyID,  companyName, symbol,  marketCap,  country,  volume,  sector,  industry );
        return new ResponseEntity<String>(companyService.addCompany(company), HttpStatus.CREATED);
    }
    @PostMapping("/updateACompany")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> updateACompany(@RequestParam Map<String, String> companyParam){
        String companyID = companyParam.get("companyID");
        String companyName = companyParam.get("companyname");
        String symbol = companyParam.get("symbol");
        String marketCap = companyParam.get("marketCap");
        String country = companyParam.get("country");
        String volume = companyParam.get("volume");
        String sector = companyParam.get("sector");
        String industry = companyParam.get("industry");
        Company company = new Company( companyID,  companyName, symbol,  marketCap,  country,  volume,  sector,  industry );
        return new ResponseEntity<String>(companyService.modifyCompany(company), HttpStatus.OK);
    }

    @PostMapping("/deleteACompany")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteACompany(@RequestParam Map<String, String> companyParam){
        String companyID = companyParam.get("companyID");
        return new ResponseEntity<String>(companyService.deleteCompany(companyID), HttpStatus.OK);
    }


}
