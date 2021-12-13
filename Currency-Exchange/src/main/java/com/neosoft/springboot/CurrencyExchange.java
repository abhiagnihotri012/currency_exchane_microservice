package com.neosoft.springboot;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Entity
public class CurrencyExchange {

	@NonNull
	@Id
	private Long id;
	
	@NonNull
	@Column(name="currency_from")
	private String from;
	
	@NonNull
	@Column(name="currency_to")
	private String to;
	
	@NonNull
	private BigDecimal conversionMultiple;
	
	public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	private String environment;

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
}