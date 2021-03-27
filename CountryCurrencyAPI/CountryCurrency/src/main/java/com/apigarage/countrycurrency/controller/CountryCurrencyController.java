package com.apigarage.countrycurrency.controller;

import com.apigarage.countrycurrency.service.CountryCurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryCurrencyController {

    @Autowired
    private CountryCurrencyService service;

    //get a specific currency
    @GetMapping("/currency/{countryName}")
    public String findByCountryName(@PathVariable String countryName) throws Exception {
        return service.findByCountryName(countryName);
    }


}
