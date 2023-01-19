package com.bolt.furniture.web.app.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BltInvoiceShelfGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BltInvoiceShelfGatewayApplication.class, args);
	}

}
