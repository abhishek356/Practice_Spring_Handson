package com.springcore.practical.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;




@Configuration
//Component Scan not required as @Component is not used.
//@ComponentScan(basePackages="com.springcore.practical.JavaConfig")
public class JavaConfig {

	
	
	@Bean//(name="firstStudentAddress")
	public Address getAddress()
	{
		return new Address();
	}
	
	@Bean(name="firstStudent")
	public Student getStudent() {
		return new Student();
	}
	
}
