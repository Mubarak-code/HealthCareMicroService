package com.microservice.ReceptionistService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ReceptionistServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReceptionistServiceApplication.class, args);
	}

}
