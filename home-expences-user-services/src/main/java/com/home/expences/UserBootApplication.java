package com.home.expences;

import javax.inject.Named;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class UserBootApplication {

	public static void main(String[] args) {
		System.out.println("Starting user services...");
		SpringApplication.run(UserBootApplication.class, args);
	}

	@Named
	static class JerseyConfig extends ResourceConfig {
		public JerseyConfig() {
			this.packages("com.home.expences.user.resources");
		}
	}
}
