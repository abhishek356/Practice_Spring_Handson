package com.springcore.practical.JavaConfig;

import org.springframework.beans.factory.annotation.Value;

public class Address {

	
	
	
	
	//@Value("Jamshedpur")
	private String city;
	//@Value("Jharkhand")
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
}
