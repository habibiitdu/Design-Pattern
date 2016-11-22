package com.designPattern.observer;

public class Subscriber implements Observable{
	public String name; 
	
	public Subscriber(String name) {
		this.name = name; 
	}
	
	@Override
	public String getName() {
		return name; 
	}
	
	@Override
	public void update(String news) {
			System.out.println(name + " updated with notifications: " + news);
	}


}
