package com.First.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context	= SpringApplication.run(FirstProjectApplication.class, args);
		
		Lazy test = context.getBean(Lazy.class);
		
		test.call();
		
	}

}
