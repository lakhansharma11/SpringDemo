package com.First.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lazy {
	@Autowired
	Laptop lap;

	public void call() {
		System.out.println("Welcome to demo project");
		
		lap.play();
		
	}
	
}
