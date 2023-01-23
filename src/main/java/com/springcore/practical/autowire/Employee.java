package com.springcore.practical.autowire;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements DisposableBean, InitializingBean {

	
	
	private String employeeId;
	private Address address;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", address=" + address + "]";
	}
	
	public Employee(Address address) {
		super();
		this.address = address;
	}
	
	@Override
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
	  System.out.println("Inside the init method");
		
	}
}
