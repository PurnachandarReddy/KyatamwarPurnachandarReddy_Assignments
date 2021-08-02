package com.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/beanlifecycle/config.xml");
		Bike b=(Bike) context.getBean("b1");
		
		System.out.println(b);
		
		
		//registering shut down hook
		context.registerShutdownHook();  //this will first run destroy method
		
		BeanCycle e=(BeanCycle)context.getBean("c1");
		System.out.println(e);
		
	}

}
