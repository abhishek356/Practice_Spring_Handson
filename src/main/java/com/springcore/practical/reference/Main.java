package com.springcore.practical.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practical/reference/reference_config.xml");
		
		A a = (A)context.getBean("aref");
		System.out.println(a.toString());
		
	}

}
