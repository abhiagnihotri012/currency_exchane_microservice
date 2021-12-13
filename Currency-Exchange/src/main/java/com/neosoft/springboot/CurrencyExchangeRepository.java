package com.neosoft.springboot;

import java.util.Currency;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<Currency, Long> {
  
	CurrencyExchange findByFromAndTo(String from,String to);
}
