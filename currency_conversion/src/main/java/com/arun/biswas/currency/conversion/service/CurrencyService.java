package com.arun.biswas.currency.conversion.service;

import com.arun.biswas.currency.conversion.model.CurrencyConversion;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public interface CurrencyService {
     CurrencyConversion getCurrencyConversion(String from, String to, BigDecimal quantity);
    CurrencyConversion getCurrencyConversionFeign(String from, String to, BigDecimal quantity);
}
