package com.springcore.practical.ci;

public class Address {

	
	
	
	
	
	private String city;
	private String state;
	
	public Address(String city, String State) {
		this.city = city;
		this.state = State;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
}
