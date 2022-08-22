package com.example.RestApiProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class RestApiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiProjectApplication.class, args);
	}

}
