package com.arun.biswas.currency.conversion.controller;

import com.arun.biswas.currency.conversion.model.CurrencyConversion;
import com.arun.biswas.currency.conversion.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyController {
    @Autowired
    private CurrencyService currencyService;

    @GetMapping("currency-conversion/from/{from}/to/{to}/{quantity}")
    public CurrencyConversion getCurrencyConversionFeign(@PathVariable("from") String from,@PathVariable("to") String to,@PathVariable("quantity") BigDecimal quantity){
        return currencyService.getCurrencyConversionFeign(from,to,quantity);
    }
}
