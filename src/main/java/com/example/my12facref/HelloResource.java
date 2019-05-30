package com.example.my12facref;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class HelloResource {
	
	@GET
	@Produces("text/plain")
	public String sayHello() {
		return "Hello!!!";
	}

}
