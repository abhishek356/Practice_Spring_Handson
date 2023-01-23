package com.springcore.practical.standaloneCollections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practical/standaloneCollections/conFig.xml");
		Person person = (Person)context.getBean("person");
		System.out.println(person.toString());
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("____________________________________________________");
		System.out.println(person.getCourseFee().getClass().getName());
		System.out.println("____________________________________________________");
		System.out.println(person.getProperties().getClass().getName());
		context.registerShutdownHook();
	}

}
