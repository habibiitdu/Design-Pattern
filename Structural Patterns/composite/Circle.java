package com.designPattern.composite;

public class Circle implements Shape{
	int x, y, radius; 
	
	public Circle(int x, int y, int radius){
		this.x = x; 
		this.y = y;
		this.radius = radius; 
	}

	@Override
	public Shape[] createShapes() {
		Shape [] shapes = {this}; 
		return shapes; 
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing cirle with: " + "X: " + x + " Y: " + y + " Radius: " + radius);		
	}
}
