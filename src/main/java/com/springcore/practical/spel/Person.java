package com.springcore.practical.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	
	
	@Value("Abhishek")
	private String name;
	@Value("#{2+3}")
	private int age;
	
	@Value("#{T(java.lang.Math).sqrt(125)}")
	private double sq;
	
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
	@Value("#{(new java.lang.String('Srivastava'))}")
	private String title;
	
	@Value("#{8>3}")
	private boolean active;
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public double getSq() {
		return sq;
	}
	public void setSq(double sq) {
		this.sq = sq;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sq=" + sq + ", pi=" + pi + ", title=" + title + ", active="
				+ active + "]";
	}
	
	
	
	
}
