package com.springcore.practical.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student student = (Student)context.getBean("firstStudent",Student.class);
		student.setName("Abhishek");
		System.out.println(student);
	}

}
