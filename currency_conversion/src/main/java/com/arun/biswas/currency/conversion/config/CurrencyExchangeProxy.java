package com.arun.biswas.currency.conversion.config;

import com.arun.biswas.currency.conversion.model.CurrencyExchangeRate;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "exchange-service")
@LoadBalancerClient(name = "exchange-service",configuration = LoadBalancerConfiguration.class)
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-service/from/{from}/to/{to}")
    CurrencyExchangeRate getCurrencyExchangeRate(@PathVariable String from, @PathVariable String to);
}
