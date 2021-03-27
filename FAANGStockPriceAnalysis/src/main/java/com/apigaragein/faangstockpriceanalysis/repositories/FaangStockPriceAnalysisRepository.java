package com.apigaragein.faangstockpriceanalysis.repositories;

import com.apigaragein.faangstockpriceanalysis.models.Amazon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaangStockPriceAnalysisRepository extends JpaRepository<Amazon, String> {
}
