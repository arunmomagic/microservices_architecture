package com.arun.biswas.currency.exchange.service;

import com.arun.biswas.currency.exchange.model.CurrencyExchangeRate;
import org.springframework.stereotype.Service;

@Service
public interface ExchangeService {
    CurrencyExchangeRate getCurrencyExchangeRate(String from,String to);
}
