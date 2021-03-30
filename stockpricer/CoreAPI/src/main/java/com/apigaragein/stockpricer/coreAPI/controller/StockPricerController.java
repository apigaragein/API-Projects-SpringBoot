package com.apigaragein.stockpricer.coreAPI.controller;

import com.apigaragein.stockpricer.coreAPI.services.StockPricerService;
import com.apigaragein.stockpricer.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class StockPricerController {

   @Autowired
   StockPricerService stockPricerService;

    @PostMapping("/getstockprice")
    public Object getStockDataByDateAndByCompany(@RequestParam Map<String, String> faangParam){
        String stockDate = faangParam.get("stockDate");
        String companyName = faangParam.get("companyName").toLowerCase();
        String operation = faangParam.get("operation").toLowerCase();
        return stockPricerService.getStockDataByDateAndByCompany(stockDate,companyName,operation);
    }

}
