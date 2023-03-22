package com.arun.biswas.currency.conversion.service.imp;

import com.arun.biswas.currency.conversion.config.CurrencyExchangeProxy;
import com.arun.biswas.currency.conversion.model.CurrencyConversion;
import com.arun.biswas.currency.conversion.model.CurrencyExchangeRate;
import com.arun.biswas.currency.conversion.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.UUID;
@Service
public class CurrencyServiceImp implements CurrencyService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private CurrencyExchangeProxy currencyExchangeProxy;

    @Override
    public CurrencyConversion getCurrencyConversion(String from, String to, BigDecimal quantity) {
        CurrencyExchangeRate currencyExchangeRate=restTemplate.getForObject("http://localhost:8001/currency-service/from/"+from+"/to/"+to, CurrencyExchangeRate.class);
        BigDecimal totalAmount=quantity.multiply(currencyExchangeRate.getExchangeRate());
        return CurrencyConversion.builder()
                .id(UUID.randomUUID().toString())
                .from(from)
                .to(to)
                .exchangeRate(currencyExchangeRate.getExchangeRate())
                .quantity(quantity)
                .totalAmount(totalAmount)
                .port(currencyExchangeRate.getPort())
                .build();
    }

    @Override
    public CurrencyConversion getCurrencyConversionFeign(String from, String to, BigDecimal quantity) {
        CurrencyExchangeRate currencyExchangeRate=currencyExchangeProxy.getCurrencyExchangeRate(from,to);
        BigDecimal totalAmount=quantity.multiply(currencyExchangeRate.getExchangeRate());
        return CurrencyConversion.builder()
                .id(UUID.randomUUID().toString())
                .from(from)
                .to(to)
                .exchangeRate(currencyExchangeRate.getExchangeRate())
                .quantity(quantity)
                .totalAmount(totalAmount)
                .port(currencyExchangeRate.getPort())
                .build();
    }
}
