package com.example.euromilhoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EuromilhoesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EuromilhoesApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EuromilhoesApplication.class);
	}
}
