package com.example.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

	@RestController
	static class HelloController {
		@GetMapping("/")
		public String hello() {
			return "Hello, Google Cloud Run!";
		}

		@GetMapping("/health")
		public String health() {
			return "OK";
		}
	}
}
