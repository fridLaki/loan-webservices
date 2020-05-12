package com.fundnesia.loan.services.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class LoanResponse implements Serializable {
	
	private List<Loan> loanResult = new ArrayList<Loan>();

	public List<Loan> getList() {
		return loanResult;
	}

	public void setList(List<Loan> list) {
		this.loanResult = list;
	}
		
}
