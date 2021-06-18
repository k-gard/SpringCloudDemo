package com.example.proxyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProxyserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyserviceApplication.class, args);
	}

}
