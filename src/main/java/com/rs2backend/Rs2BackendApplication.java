package com.rs2backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.rs2backend.repository,com.rs2backend.controller,com.rs2backend.service,com.rs2backend.entities,com.rs2backend.util")
public class Rs2BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(Rs2BackendApplication.class, args);
	}

}
