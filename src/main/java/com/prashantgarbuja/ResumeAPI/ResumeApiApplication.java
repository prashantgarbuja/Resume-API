package com.prashantgarbuja.ResumeAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Prashant Resume API", version = "1.0", description = "An API to extract my information."))
public class ResumeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeApiApplication.class, args);
	}

}
