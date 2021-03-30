package com.apigaragein.stockpricer.coreAPI.repositories;

import com.apigaragein.stockpricer.coreAPI.models.Amazon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockPricerRepository extends JpaRepository<Amazon, String> {
}
