package com.springcore.practical.JavaConfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	
	
	
	
	
	private String name;
	//@Autowired // @Autowired is only used when we are using @ComponentScan annotatioo
	private Address address;
//		public Student(Address address) {
//		// TODO Auto-generated constructor stub
//			this.address = address;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
}
	
	

