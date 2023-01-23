package com.springcore.pratical.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {

	
	
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
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
}
	
	

