package com.fundnesia.loan.services.endpoint;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.fundnesia.loan.services.api.LoanService;
import com.fundnesia.loan.services.impl.LoanServiceImpl;
import com.fundnesia.loan.services.model.Loan;
import com.fundnesia.loan.services.model.LoanRequest;
import com.fundnesia.loan.services.model.LoanResponse;
import com.google.gson.Gson;

@Path("loan")
public class LoanServiceEndpoint {

	private LoanService loanService;

	@Autowired
	public void setLoanService(LoanService loanService) {
		this.loanService = loanService;
	}

	private Gson gson = new Gson();
	
	@POST
	@Path("requestloan")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String loanSimulation(String request) {
		LoanRequest loanRequest = gson.fromJson(request, LoanRequest.class);
		LoanResponse response = new LoanResponse();
		
		List<Loan> list = loanService.processLoan(loanRequest); 
		response.setList(list);
		
		return gson.toJson(response, LoanResponse.class);
	}
}
