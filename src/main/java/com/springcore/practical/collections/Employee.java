package com.springcore.practical.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	
	
	
	
	private List<String> empId;
	private Set <String> empName;
	private Map <String,String>address;
	public List<String> getEmpId() {
		return empId;
	}
	public void setEmpId(List<String> empId) {
		this.empId = empId;
	}
	public Set<String> getEmpName() {
		return empName;
	}
	public void setEmpName(Set<String> empName) {
		this.empName = empName;
	}
	public Map<String, String> getAddress() {
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	
	
}
