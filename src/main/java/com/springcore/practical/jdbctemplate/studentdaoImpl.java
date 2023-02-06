package com.springcore.practical.jdbctemplate;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;



@Component("studentdao")
public class studentdaoImpl implements studentdao{
	@Autowired
	JdbcTemplate jdbc;
	


//Properties property = new Properties();

//property.load(new FileInputStream("B:\\Github\\Practice_Spring_Handson\\src\\main\\java\\property.properties"));

studentdaoImpl(JdbcTemplate jdbc)
{
	this.jdbc = jdbc;
}

public JdbcTemplate getJdbc() {
	return jdbc;
}

public void setJdbc(JdbcTemplate jdbc) {
	this.jdbc = jdbc;
}

@Override
public int insert(Student student) {
	// TODO Auto-generated method stub
	int resultset;
	String query = "Insert into student values (?,?,?)";
	resultset = jdbc.update(query,100,student.getName(),student.getCity());
	return resultset;
}

@Override
public int update(Student student) {
	// TODO Auto-generated method stub
	int resultset;
	String query = "Update student set name = ?,city =? where id =?";
	resultset = jdbc.update(query,student.getName(),student.getCity());
	return resultset;
}

//@Override
//public Student select(int id) {
//	// TODO Auto-generated method stub
//	
//	String query = "Select * from student where id = ?";
//	
//	
//	RowMapper rowMapper = new RowMapperImpl();
//	
//Student student =    jdbc.queryForObject(query,rowMapper,id);
//	
//	return student;
//}

@Override
public Student select(int id) {
	// TODO Auto-generated method stub
	
	String query = "Select * from student where id = ?";
	
	
//	RowMapper rowMapper = new RowMapperImpl();
	
Student student =    jdbc.queryForObject(query,new RowMapper() {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		
		return student;
	}
	
	
},id);
	
	return student;
}

@Override
public List<Student> getAllStudents() {
	// TODO Auto-generated method stub
	
	String query = "select * from student";
	//List <Student> students = new ArrayList<Student>();
	RowMapper rowmapper = new RowMapperImpl();
	List <Student> students = jdbc.query(query,rowmapper);
	
	return students;
}




	
	}

