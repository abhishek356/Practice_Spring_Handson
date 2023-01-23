package com.springcore.practical.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {


		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/practical/ci/ci_config.xml");
		
		Person person = (Person)context.getBean("person");
		System.out.println(person.toString());
	}

}
