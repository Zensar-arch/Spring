package com.zensar.spring.instruments;

public class Guitar implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Ting Ting Tring");

	}

	@Override
	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("Ring ring ring");
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("guitarist cleaned");
	}

	
}
