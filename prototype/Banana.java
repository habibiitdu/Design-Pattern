package com.designPattern.prototype;

public class Banana extends Fruits{

	public Banana(String name){
		this.name = name;
	}
	@Override
	public Fruits clone() {
		return this; 
	}

}
