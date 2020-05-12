package com.fundnesia.loan.services.api;

import java.util.List;

import com.fundnesia.loan.services.model.Loan;
import com.fundnesia.loan.services.model.LoanRequest;

public interface LoanService {
	List<Loan> processLoan(LoanRequest loanRequest);
}
