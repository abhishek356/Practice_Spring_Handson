package com.springcore.practical.componentScanner;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	
	@Value("Jamshedpur")
	private String city;
	@Value("Jharkhand")
	private String state;
	@Value("#{nos}")
	private List<String> phoneNumbers;
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
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
		return "Address [city=" + city + ", state=" + state + ", phoneNumbers=" + phoneNumbers + "]";
	}

	
	
}
