package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Alion {
@Autowired
	Laptop lap;
	public void code() {
		
		lap.compile();
		System.out.println("i am coding");
	}
	
}
