package com.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/list/configlist.xml");
		QuestionList quest=(QuestionList) context.getBean("qlist");
		System.out.println(quest);

	}

}
