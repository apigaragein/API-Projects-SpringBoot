package com.apigarage.countrycurrency.repository;

import com.apigarage.countrycurrency.model.CountryCurrency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryCurrencyRepository extends JpaRepository<CountryCurrency, Integer>{

    CountryCurrency findByCountryName(String countryName);
}
