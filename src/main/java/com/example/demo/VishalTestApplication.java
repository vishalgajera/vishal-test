package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VishalTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(VishalTestApplication.class, args);
	}

	@GetMapping(value = { "/", "/index", "/home" })
	public String home() {
		return "welcome to vishal-test app";
	}

}
