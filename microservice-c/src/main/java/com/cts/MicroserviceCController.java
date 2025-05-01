package com.cts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MicroserviceCController {
	@Value("${spring.application.name}")
	private String name;
	@Value("${server.port}")
	private int port;
	@Value("${company.name} ${company.location}")
	private String address;
	
	@GetMapping("/service-c")
	public String getServiceA() {
		return "Hello i am from "+name+" "+port + " "+address;
	}
	

}
