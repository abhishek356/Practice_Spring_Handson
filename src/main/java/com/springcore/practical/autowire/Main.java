package com.springcore.practical.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practical/autowire/config_autowire.xml");
	Employee emp1  = (Employee)context.getBean("employee");
	context.registerShutdownHook();
	System.out.println(emp1.toString());
	}
	
	

}
