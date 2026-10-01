package com.klu.eurekajwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekajwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekajwtApplication.class, args);
	}

}
