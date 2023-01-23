package com.springcore.practical.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
			// TODO Auto-generated method stub
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practical/collections/collections_config.xml");
			Employee emp1 = (Employee) context.getBean("employee");
			System.out.println(emp1.toString());
	}

}
