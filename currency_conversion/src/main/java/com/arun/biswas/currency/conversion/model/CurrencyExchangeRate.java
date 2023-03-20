package com.arun.biswas.currency.conversion.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class CurrencyExchangeRate implements Serializable {
    private Integer id;
    private String from;
    private String to;
    private BigDecimal exchangeRate;
    private Integer port;
}
