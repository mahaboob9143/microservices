package com.cts;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="MICROSERVICE-B") //internal load balancer
public interface OpenFeighnInterface {
		@GetMapping("/service-b") 
		public String getData(); //http://MICROSERVICE-B/service-b}
}