package com.springcore.practical.autowire.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practical/autowire/second/Annotation_conFig.xml");
		Person person = (Person)context.getBean("person");
		
		System.out.println(person.toString());
		
	}
}
