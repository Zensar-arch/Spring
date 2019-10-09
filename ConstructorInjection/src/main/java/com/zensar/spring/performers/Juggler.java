package com.zensar.spring.performers;

public class Juggler implements Performer {
	private int beanBags;
	
	public Juggler() {
		// TODO Auto-generated constructor stub
		System.out.println("No arguement constructor of juggler");
	}
	

	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("parameterized constructor of juggler");
	}


	public void perform(){
		// TODO Auto-generated method stub
		System.out.println("Juggler juggling beanbags"+beanBags);

	}

}
