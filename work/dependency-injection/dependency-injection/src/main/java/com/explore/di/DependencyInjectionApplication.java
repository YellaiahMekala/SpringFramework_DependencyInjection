package com.explore.di;

import com.explore.di.di.UserApp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DependencyInjectionApplication  {

	public static void main(String[] args) {
		System.out.println("spring app run method started");
	ConfigurableApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);
//		UserApp appbean = applicationContext.getBean(UserApp.class);
//		appbean.loadUserFeeds();
		System.out.println("spring app run method completed");

	}
	
//implement cmd line runner interface
	/*@Override
	public void run(String... args) throws Exception {
		System.out.println("cmd line runner run method executed");
		System.out.println("establish jdbc connection before startup");
		System.out.println("cmd liner used to populated data to db before app startup");
	}*/

	@PostConstruct
	public void preInitialization(){
		System.out.println("preprocessing logic executed without cmd line runner");
	}
}
