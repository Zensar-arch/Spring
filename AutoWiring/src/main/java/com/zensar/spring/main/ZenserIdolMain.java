package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.config.PerformerConfig;
import com.zensar.spring.performers.Performer;

public class ZenserIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext p=new AnnotationConfigApplicationContext(PerformerConfig.class);
		Performer p1 =p.getBean("pyare mohan", Performer.class);
		p1.perform();

	}

}
