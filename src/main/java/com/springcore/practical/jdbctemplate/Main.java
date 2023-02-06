package com.springcore.practical.jdbctemplate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/practical/jdbctemplate/Jdbcconfig.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		studentdao studentdao = context.getBean("studentdao",studentdaoImpl.class);
		
//		Student student = new Student();
//		student.setId(2);
//		student.setName("saroj");
//		student.setCity("Jamshedpur");
//		
//		studentdao.insert(student);
//		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
        System.out.println(studentdao.select(456));
   
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        
        List <Student> students = new ArrayList<Student>();
        students = studentdao.getAllStudents();
        for(Student s : students)
        {
        	System.out.println(s);
        }
	}

}
