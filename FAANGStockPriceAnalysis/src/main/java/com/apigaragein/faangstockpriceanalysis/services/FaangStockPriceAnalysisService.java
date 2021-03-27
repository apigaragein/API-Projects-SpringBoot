package com.apigaragein.faangstockpriceanalysis.services;

import com.apigaragein.faangstockpriceanalysis.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaangStockPriceAnalysisService {

    @Autowired
    private AmazonRepository amazonRepository;
    @Autowired
    private AppleRepository appleRepository;
    @Autowired
    private FacebookRepository facebookRepository;
    @Autowired
    private NetflixRepository netflixRepository;
    @Autowired
    private GoogleRepository googleRepository;

    public Object getStockDataByDateAndByCompany(String stockDate, String companyName, String operation){
        if(companyName.equals("facebook")){
            return getData(facebookRepository,operation, stockDate);
        }else if (companyName.equals("amazon")){
            return getData(amazonRepository,operation, stockDate);
        }else if (companyName.equals("apple")){
            return getData(appleRepository,operation, stockDate);
        }else if (companyName.equals("netflix")){
            return getData(netflixRepository,operation, stockDate);
        } else if (companyName.equals("google")){
            return getData(googleRepository,operation, stockDate);
        }else{
            return new StringBuilder("Company Name Not a Valid one. Supported Companies are ")
                    .append( "  1. Facebook")
                    .append( "  2. Amazon")
                    .append("   3. Apple")
                    .append("   4. Netflix")
                    .append("   5. Google.");
        }
    }

    public Object getData(FaangStockPriceAnalysisRepository repository, String operation, String stockDate){
        switch (operation) {
            case "full":
                return repository.getOne(stockDate);
            case "volume":
                return repository.getOne(stockDate).getVolume();
            case "open":
                return repository.getOne(stockDate).getOpenPrice();
            case "high":
                return repository.getOne(stockDate).getHighPrice();
            case "low":
                return repository.getOne(stockDate).getLowPrice();
            case "close":
                return repository.getOne(stockDate).getClosePrice();
            case "adjclose":
                return repository.getOne(stockDate).getAdjclose();
            default:
                return "Unrecognised operation given. Supported operations are " +
                        "   1. Full " +
                        "   2. Volume " +
                        "   3. Open " +
                        "   4. High " +
                        "   5. Low " +
                        "   6. Close " +
                        "   7. AdjClose ";

        }
    }

}
