package com.apigarage.countrycurrency.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CountryCurrency {
    private @Id Integer id;
    private String countryName;
    private String currencyName;

    public CountryCurrency(){

    }
    public CountryCurrency(Integer id, String countryName, String currencyName) {
        this.id = id;
        this.countryName = countryName;
        this.currencyName = currencyName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
}
