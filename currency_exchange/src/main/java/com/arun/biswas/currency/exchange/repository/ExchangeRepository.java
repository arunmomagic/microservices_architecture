package com.arun.biswas.currency.exchange.repository;

import com.arun.biswas.currency.exchange.model.CurrencyExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRepository extends JpaRepository<CurrencyExchangeRate,Integer> {
    CurrencyExchangeRate findByFromAndTo(String from,String to);
}
