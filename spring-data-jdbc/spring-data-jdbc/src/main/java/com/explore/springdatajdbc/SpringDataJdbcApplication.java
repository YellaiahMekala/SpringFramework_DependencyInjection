package com.explore.springdatajdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJdbcApplication {

	public static void main(String[] args) {
		System.out.println("main method execution started");
		SpringApplication.run(SpringDataJdbcApplication.class, args);
		System.out.println("spring boot main method execution completed");
	}

}
