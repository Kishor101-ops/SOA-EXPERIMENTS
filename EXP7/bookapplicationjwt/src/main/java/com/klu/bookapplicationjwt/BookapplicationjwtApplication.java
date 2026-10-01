package com.klu.bookapplicationjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class BookapplicationjwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookapplicationjwtApplication.class, args);
	}

}
