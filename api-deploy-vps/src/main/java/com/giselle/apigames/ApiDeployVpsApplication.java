package com.giselle.apigames;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiDeployVpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDeployVpsApplication.class, args);
	}

}
