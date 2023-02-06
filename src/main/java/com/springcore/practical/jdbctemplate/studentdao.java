package com.springcore.practical.jdbctemplate;

import java.util.List;

public interface studentdao {

	
	
	
	
	public int insert (Student student);
	public int update (Student student);
	public Student select(int id);
	
	public List<Student> getAllStudents();
}
