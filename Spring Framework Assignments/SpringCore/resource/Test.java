package com.annotations.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		// TODO Auto-generated method stub

	
	ApplicationContext ac = new ClassPathXmlApplicationContext("com/annotations/resource/config.xml");
	 
    Employee emp = ac.getBean("myemployee", Employee.class);
    System.out.println(emp.toString());
	}

}
