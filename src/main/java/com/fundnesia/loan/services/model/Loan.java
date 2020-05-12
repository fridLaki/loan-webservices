package com.fundnesia.loan.services.model;

import java.math.BigDecimal;

public class Loan {
	private Integer tenure;
	private BigDecimal ticketSize;
	private BigDecimal fee;
	private BigDecimal totalLoan;
	private BigDecimal isntallmentPerMonth;
	private String status;
	
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
	public BigDecimal getFee() {
		return fee;
	}
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}
	public BigDecimal getTotalLoan() {
		return totalLoan;
	}
	public void setTotalLoan(BigDecimal totalLoan) {
		this.totalLoan = totalLoan;
	}
	public BigDecimal getIsntallmentPerMonth() {
		return isntallmentPerMonth;
	}
	public void setIsntallmentPerMonth(BigDecimal isntallmentPerMonth) {
		this.isntallmentPerMonth = isntallmentPerMonth;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
