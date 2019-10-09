package com.zensar.spring.performers;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	private Map<Instrument, String> instrumentSongMap;

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing song ");
		for (Map.Entry<Instrument, String> entry : instrumentSongMap.entrySet()) {

			entry.getKey().play();
			System.out.println("song is "+entry.getValue());
		}

	}

	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}

	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}

}