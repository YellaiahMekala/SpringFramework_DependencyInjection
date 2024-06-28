package com.explore.sbScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSchedulerApplication {

	public static void main(String[] args) {
		System.out.println("run method started");
		SpringApplication.run(SpringbootSchedulerApplication.class, args);
		System.out.println("run method completed");
	}

}
