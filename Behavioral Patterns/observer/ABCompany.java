package com.designPattern.observer;

public class ABCompany implements Observable{
	public String name; 
	
	public ABCompany() {
		this.name = "AB Company"; 
	}
	
	public String getName(){
		return name; 
	}
	
	@Override
	public void update(String news) {
			System.out.println(name + " updated with: " + news );
	}

}
