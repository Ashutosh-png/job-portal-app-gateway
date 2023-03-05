package com.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GateTcsForm1Application {

	public static void main(String[] args) {
		SpringApplication.run(GateTcsForm1Application.class, args);
	}

}
