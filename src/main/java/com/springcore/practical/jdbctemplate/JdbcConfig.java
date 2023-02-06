package com.springcore.practical.jdbctemplate;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan (value = "com.springcore.practical.jdbctemplate")
public class JdbcConfig {

	@Bean(name= {"ds"})
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/employeeinfo");
		ds.setUsername("root");
		ds.setPassword("amit1996");
		
		return ds;
	}
	
	@Bean(name= {"jdbcTemplate"})
	public JdbcTemplate getJdbcTemplate()
	{
		return new JdbcTemplate(getDataSource());
	}
	
//	@Bean(name = {"studentdao"})
//	public studentdaoImpl getStudentdao()
//	{
//		
//		return new studentdaoImpl(getJdbcTemplate());
//	}
//	
	
	
}
