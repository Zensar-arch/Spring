package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZenserIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext p=new ClassPathXmlApplicationContext("performers.xml");
		Performer p1=p.getBean("Susmita", Performer.class);
		p1.perform();
	}

}
