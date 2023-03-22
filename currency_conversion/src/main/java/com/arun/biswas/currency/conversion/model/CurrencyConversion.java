package com.arun.biswas.currency.conversion.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class CurrencyConversion implements Serializable {
    private String id;
    private String from;
    private String to;
    private BigDecimal quantity;
    private BigDecimal exchangeRate;
    private BigDecimal totalAmount;
    private Integer port;
}
