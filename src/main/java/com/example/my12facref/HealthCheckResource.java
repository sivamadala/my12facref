package com.example.my12facref;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("/health")
public class HealthCheckResource {
	
	@GET
	//@Produces(MediaType.APPLICATION_JSON)
	public void statusCode() {
		//respo
	}

}
