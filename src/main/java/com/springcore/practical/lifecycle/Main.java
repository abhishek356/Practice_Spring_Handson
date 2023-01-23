package com.springcore.practical.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String args[]) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practical/lifecycle/Lifecycle_config.xml");
		Lifecycle life = (Lifecycle) context.getBean("lifecycle");
		context.registerShutdownHook();
		System.out.println(life.toString());
	}
	
}
