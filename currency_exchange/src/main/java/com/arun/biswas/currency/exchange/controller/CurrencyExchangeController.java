package com.arun.biswas.currency.exchange.controller;

import com.arun.biswas.currency.exchange.model.CurrencyExchangeRate;
import com.arun.biswas.currency.exchange.service.ExchangeService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
    private Logger logger= LoggerFactory.getLogger(CurrencyExchangeController.class);
    @Autowired
    private Environment environment;
    @Autowired
    private ExchangeService exchangeService;
    @GetMapping("/currency-service/from/{from}/to/{to}")
    public CurrencyExchangeRate getCurrencyExchangeRate(@PathVariable String from, @PathVariable String to) {
        CurrencyExchangeRate currencyExchangeRate=exchangeService.getCurrencyExchangeRate(from,to);
        currencyExchangeRate.setPort(Integer.parseInt(environment.getProperty("server.port")));
        logger.info("currencyExchangeRate {}",new Gson().toJson(currencyExchangeRate));
        return currencyExchangeRate;
    }
}
