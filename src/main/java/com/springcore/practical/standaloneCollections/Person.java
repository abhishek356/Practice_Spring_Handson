package com.springcore.practical.standaloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;

public class Person {

		
	private List <String> friends;
	private Map <String,String> courseFee;
	
	/**
	 * 
	 */
	private Properties properties;
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, String> getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(Map<String, String> courseFee) {
		this.courseFee = courseFee;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	
	

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courseFee=" + courseFee + ", properties=" + properties + "]";
	}

	public void destroy() {
		System.out.println("Inside destroy method");
	}
}
