package com.designPattern.observer;

public class PSCompany implements Observable{
public String name; 
	
	public PSCompany() {
		this.name = "PS Company"; 
	}

	public String getName(){
		return name; 
	}
	
	@Override
	public void update(String news) {
			System.out.println(name + "updated with: " + news );
	}
}
