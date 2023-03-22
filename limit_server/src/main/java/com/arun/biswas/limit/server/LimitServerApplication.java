package com.arun.biswas.limit.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigurationProperties
@EnableEurekaClient
public class LimitServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitServerApplication.class, args);
	}

}
