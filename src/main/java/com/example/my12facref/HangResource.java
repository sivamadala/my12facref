package com.example.my12facref;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("/hang")
public class HangResource {
	
	@GET
	public String hang() {
		infiniteLoop();
		return null;
	}
	
	private void infiniteLoop() {
		ThreadPoolExecutor executors = new ThreadPoolExecutor(1025, 1025, 1000, TimeUnit.DAYS, new LinkedBlockingDeque<>()
				);
		//while(true);
	}

}
