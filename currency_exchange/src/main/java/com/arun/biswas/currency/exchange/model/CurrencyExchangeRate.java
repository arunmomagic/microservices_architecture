package com.arun.biswas.currency.exchange.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "currency_exchange_rate")
public class CurrencyExchangeRate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "from")
    private String from;
    @Column(name = "to")
    private String to;
    @Column(name = "exchange_rate")
    private BigDecimal exchangeRate;
    @Transient
    private Integer port;
}
