package com.example.transmilenio;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootTest
@EnableJpaAuditing
@SpringBootApplication
class TransmilenioApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(TransmilenioApplicationTests.class, args);
	}
}
