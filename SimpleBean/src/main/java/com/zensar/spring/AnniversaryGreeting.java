package com.zensar.spring;

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
