package com.home.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProductApplication {
	public static void main(String[] args) {
		System.out.println("Starting spring product application...");
		SpringApplication.run(SpringProductApplication.class, args);
	}
}
