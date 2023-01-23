package com.springcore.practical.componentScanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practical/componentScanner/ComponentconFig.xml");
		
		Person person =  context.getBean(Person.class);
		System.out.println(person.toString());
		System.out.println(person.hashCode());
		System.out.println("---------------------------------------------");
		
		Person person1 = context.getBean(Person.class);
		System.out.println(person1.hashCode());
		
	}

}
