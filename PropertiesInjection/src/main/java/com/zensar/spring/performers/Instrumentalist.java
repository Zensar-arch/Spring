package com.zensar.spring.performers;

import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class Instrumentalist implements Performer {
	private Properties instrumentSongProps;

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		Enumeration instruments = instrumentSongProps.keys();
		System.out.println("Instrumentalist is playing songs ");
		while (instruments.hasMoreElements()) {
			String instrumentName = (String) instruments.nextElement();
			String song = instrumentSongProps.getProperty(instrumentName);
			System.out.println(song+" by "+instrumentName);
		}
	}

	public Properties getInstrumentSongProps() {
		return instrumentSongProps;
	}

	public void setInstrumentSongProps(Properties instrumentSongProps) {
		this.instrumentSongProps = instrumentSongProps;
	}
	

}