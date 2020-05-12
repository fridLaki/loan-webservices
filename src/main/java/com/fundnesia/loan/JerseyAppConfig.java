package com.fundnesia.loan;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.fundnesia.loan.services.endpoint.LoanServiceEndpoint;

@Component
@ApplicationPath("/api")
public class JerseyAppConfig extends ResourceConfig {
	public JerseyAppConfig() {
		register(LoanServiceEndpoint.class);
//		packages("com.frids.demojaxrs.resources");
	}
}
