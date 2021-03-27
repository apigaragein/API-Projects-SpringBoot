package com.apigarage.countrycurrency.service;

import com.apigarage.countrycurrency.model.CountryCurrency;
import com.apigarage.countrycurrency.repository.CountryCurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryCurrencyService {

    @Autowired
    private  CountryCurrencyRepository repository;

    public String findByCountryName(String countryName) throws Exception {
        CountryCurrency currency = repository.findByCountryName(countryName);
        if(currency != null){
            return currency.getCurrencyName();
        } else{
            throw new Exception("Not a valid country name");
        }
    }
}
