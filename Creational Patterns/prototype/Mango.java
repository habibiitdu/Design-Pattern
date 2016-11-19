package com.designPattern.prototype;

public class Mango extends Fruits{

	public Mango(String name){
		this.name = name; 
	}
	
	@Override
	public Fruits clone() {
		return this; 
	}
	
}
