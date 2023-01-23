package com.springcore.practical.autowire.second;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	
	
private String name;
@Autowired
private Address address;
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
	return "Person [name=" + name + ", address=" + address + "]";
}

public Person(Address address) {
	super();
}

}
