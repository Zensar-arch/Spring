package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.google.common.annotations.Beta;
import com.zensar.spring.instruments.Instrument;
@Component("pyare mohan")
public class Instrumentalist implements Performer {
	@Autowired//only in complex type used
	@Qualifier("piano")
	private Instrument instrument;
	@Value(value = " alvida")
	private String song;

	
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
		System.out.println("Instrumentalist is playing a song"+song);
		instrument.play();
		

	}

}