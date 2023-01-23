package com.springcore.practical.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practical/spel/SpelconFig.xml");
		Person person = context.getBean(Person.class);
		
		System.out.println(person.toString());

	}

}
