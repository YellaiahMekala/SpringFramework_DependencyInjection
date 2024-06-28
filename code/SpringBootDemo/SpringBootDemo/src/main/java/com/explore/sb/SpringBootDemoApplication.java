package com.explore.sb;

import com.explore.sb.condition.DataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("run method started");
		SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("run method completed");
	}
	@Autowired
	private DataSourceConfig dataSourceConfig;
	@Override
	public void run(String... args) throws Exception {
		dataSourceConfig.makeconnection();

	}
}
