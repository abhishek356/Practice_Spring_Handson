package com.springcore.practical.lifecycle;

public class Lifecycle {

	
	
	private double x;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		System.out.println("Inside setter method");
		this.x = x;
	}

	@Override
	public String toString() {
		return "Lifecycle [x=" + x + "]";
	}

	public Lifecycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
}
