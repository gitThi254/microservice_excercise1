package com.example.eurukaService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
public class EurukaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurukaServiceApplication.class, args);
	}

}
