package com.arun.biswas.currency.exchange.service.imp;

import com.arun.biswas.currency.exchange.model.CurrencyExchangeRate;
import com.arun.biswas.currency.exchange.repository.ExchangeRepository;
import com.arun.biswas.currency.exchange.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeServiceImp implements ExchangeService {
    @Autowired
    private ExchangeRepository exchangeRepository;
    @Override
    public CurrencyExchangeRate getCurrencyExchangeRate(String from, String to) {
        return exchangeRepository.findByFromAndTo(from,to);
    }
}
