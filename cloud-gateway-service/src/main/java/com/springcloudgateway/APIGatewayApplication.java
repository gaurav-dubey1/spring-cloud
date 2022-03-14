package com.springcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class APIGatewayApplication {
	
	/*
	 * It is a Main Application to execute the APIGatewayApplication.
	 */

	public static void main(String[] args) {
		SpringApplication.run(APIGatewayApplication.class, args);
	}

}
