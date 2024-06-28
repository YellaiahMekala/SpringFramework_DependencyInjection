package com.explore.sbEmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbEmailApplication {

	public static void main(String[] args) {
		System.out.println("run method started");
		SpringApplication.run(SbEmailApplication.class, args);
		System.out.println("run method completed");
	}

}
