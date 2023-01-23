package com.springcore.practical;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("conFig.xml");
         Student student = (Student) context.getBean("student");
         Student student1 = (Student)context.getBean("student1");
         Student student2 = (Student)context.getBean("student2");
         
         System.out.println(student.toString());
         System.out.println(student1.toString());
         System.out.println(student2.toString());
         
         ((AbstractApplicationContext) context).close();
    }
}
