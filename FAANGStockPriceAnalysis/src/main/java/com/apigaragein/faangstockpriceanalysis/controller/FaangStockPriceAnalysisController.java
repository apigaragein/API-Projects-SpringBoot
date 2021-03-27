package com.apigaragein.faangstockpriceanalysis.controller;

import com.apigaragein.faangstockpriceanalysis.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class FaangStockPriceAnalysisController {

   @Autowired
    FaangStockPriceAnalysisService faangStockPriceAnalysisService;

    @PostMapping("/getstockprice")
    public Object getStockDataByDateAndByCompany(@RequestParam Map<String, String> faangParam){
        String stockDate = faangParam.get("stockDate");
        String companyName = faangParam.get("companyName").toLowerCase();
        String operation = faangParam.get("operation").toLowerCase();
        return faangStockPriceAnalysisService.getStockDataByDateAndByCompany(stockDate,companyName,operation);
    }

}
