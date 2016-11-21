package com.designPattern.composite;

public class Rectangle implements Shape{
	
	@Override
	public Shape[] createShapes() {
		Shape [] rectangle = {new Line(0, 0, 0, 5), new Line(0, 5, 5, 5), new Line(5, 5, 5, 0), new Line(5, 0, 5, 5)}; 
		return rectangle; 
	}

	@Override
	public void drawShape() {
		for (Shape shape : createShapes()) {
			shape.drawShape();
		}
	}

}
