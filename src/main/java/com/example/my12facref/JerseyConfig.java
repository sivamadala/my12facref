package com.example.my12facref;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
		register(HelloResource.class);
		register(HangResource.class);
		register(HealthCheckResource.class);
	}

}
