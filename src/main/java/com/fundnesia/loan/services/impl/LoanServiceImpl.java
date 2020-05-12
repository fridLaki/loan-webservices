package com.fundnesia.loan.services.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.fundnesia.loan.services.api.LoanService;
import com.fundnesia.loan.services.model.Loan;
import com.fundnesia.loan.services.model.LoanRequest;

@Component
public class LoanServiceImpl implements LoanService {
	
	@Autowired
	private KafkaTemplate<Object, Object> template;
	
	@Override
	public List<Loan> processLoan(LoanRequest loanRequest) {
		List<Loan> list = new ArrayList<Loan>();
		Integer tenure = loanRequest.getTenure();
		BigDecimal ticketSize = loanRequest.getTicketSize();
		BigDecimal fee =  BigDecimal.valueOf(2).divide(BigDecimal.valueOf(100)).multiply(ticketSize.multiply(BigDecimal.valueOf(tenure)));
		BigDecimal totalLoan = ticketSize.add(fee);
		BigDecimal installmentPerMonth = totalLoan.divide(BigDecimal.valueOf(tenure), 2, RoundingMode.HALF_UP);
		
		Loan loan = new Loan();
		loan.setTenure(tenure);
		loan.setTicketSize(ticketSize);
		loan.setFee(fee);
		loan.setTotalLoan(totalLoan);
		loan.setIsntallmentPerMonth(installmentPerMonth);
		loan.setStatus("SUBMITTED");
		list.add(loan);
		
//		this.template.send("loanRequest", "Congratulations!! Your loan has been approved " + list);
		
		return list;
	}

}
