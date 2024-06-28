package com.explore.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseServiceApplication {

	public static void main(String[] args) {
		System.out.println("run method started");
		SpringApplication.run(CourseServiceApplication.class, args);
		System.out.println("run method completed" +
				"");

	}

}
