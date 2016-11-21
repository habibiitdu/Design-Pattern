package com.designPattern.composite;

public class Line implements Shape{
	int X1, X2, Y1, Y2; 
	
	public Line(int X1, int Y1, int X2, int Y2){
		this.X1 = X1; 
		this.Y1 = Y1; 
		this.X2 = X2; 
		this.Y2 = Y2; 
	}
	
	@Override
	public Shape[] createShapes() {
		Shape [] shapes = {this}; 
		return shapes; 
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing Line with: " + "X1: " + X1 + " Y1: " + Y1 + " X2: " + X2 + " Y2: " + Y2);	
	}

}
