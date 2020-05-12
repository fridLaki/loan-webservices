package com.fundnesia.loan.services.model;

import java.io.Serializable;
import java.math.BigDecimal;

@SuppressWarnings("serial")
public class LoanRequest implements Serializable {
	private Integer tenure;
	private BigDecimal ticketSize;
	
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	public BigDecimal getTicketSize() {
		return ticketSize;
	}
	public void setTicketSize(BigDecimal ticketSize) {
		this.ticketSize = ticketSize;
	}
	
}
