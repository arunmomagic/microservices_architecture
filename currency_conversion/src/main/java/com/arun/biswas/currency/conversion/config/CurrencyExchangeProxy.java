package com.arun.biswas.currency.conversion.config;

import com.arun.biswas.currency.conversion.model.CurrencyExchangeRate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Component
@FeignClient(name = "exchange-service",url = "localhost:8001")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-service/from/{from}/to/{to}")
    CurrencyExchangeRate getCurrencyExchangeRate(@PathVariable String from, @PathVariable String to);

    }
