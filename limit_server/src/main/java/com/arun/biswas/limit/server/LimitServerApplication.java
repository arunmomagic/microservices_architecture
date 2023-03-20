package com.arun.biswas.limit.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class LimitServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitServerApplication.class, args);
	}

}
