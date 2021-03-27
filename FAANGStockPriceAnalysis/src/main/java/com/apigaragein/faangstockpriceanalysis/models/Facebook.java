package com.apigaragein.faangstockpriceanalysis.models;

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
@Table(name="facebookstockdata")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Facebook  {
    @Id
    String stockDate;
    String openPrice;
    String highPrice;
    String lowPrice;
    String closePrice;
    String adjclose;
    String volume;
}
