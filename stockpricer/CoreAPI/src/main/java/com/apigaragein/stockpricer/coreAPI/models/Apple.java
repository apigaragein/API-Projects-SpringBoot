package com.apigaragein.stockpricer.coreAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="applestockdata")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Apple  {
    @Id
    String stockDate;
    String openPrice;
    String highPrice;
    String lowPrice;
    String closePrice;
    String adjclose;
    String volume;
}
