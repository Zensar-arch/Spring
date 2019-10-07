package com.zensar.spring;

public class FestivalGreeting implements Greeting {

	@Override
	public String Greet() {
		// TODO Auto-generated method stub
		return "Happy Durga Puja";
	}
	
	public FestivalGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Festival Greeting is created");
	}

}
