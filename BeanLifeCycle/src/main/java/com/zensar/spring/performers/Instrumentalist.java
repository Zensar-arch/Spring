package com.zensar.spring.performers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer,BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean {
	private Instrument instrument;
	private String song;
	private String name;
public Instrumentalist() {
	// TODO Auto-generated constructor stub
	System.out.println("Instrumentalist is created");
}
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
		System.out.println("Instrumentalist is playing a song"+song);
		instrument.play();
		System.out.println("Bean Name is Set");

	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrument is set");
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is set");
	}
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.name= name;
		
		
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanFactory is set");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after properties set");
		//instrument.tune();
		
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		
	}
	public void tuneInstrument() {
		System.out.println("tune instument");
		instrument.tune();
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy");
		instrument.clean();
	}
	
	public void cleanInstrument() {
		System.out.println("custom destroy method");
	}

}
