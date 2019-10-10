package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component//replaces xml bean definition
public class AnniversaryGreeting implements Greeting {

	@Override
	public String Greet() {
		// TODO Auto-generated method stub
		return "Happy Anniversary";
	}
	public AnniversaryGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Anniversaary Greeting is created");
	}

}
