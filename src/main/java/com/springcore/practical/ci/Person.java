package com.springcore.practical.ci;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	
	
	
	
	private String name;
	@Autowired
	private Address address;
	
	Person(String name, Address address){
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
	
}
