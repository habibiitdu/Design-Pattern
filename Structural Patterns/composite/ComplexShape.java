package com.designPattern.composite;

import java.util.ArrayList;

public class ComplexShape implements Shape{
	
	public ArrayList<Shape> complexShapes = new ArrayList<Shape>(); 
	
	public void addToShape(Shape shapesToAdd){
		complexShapes.add(shapesToAdd); 
	}

	@Override
	public Shape[] createShapes() {
		return (Shape [])complexShapes.toArray();
	}

	@Override
	public void drawShape() {
		for (Shape shape : complexShapes) {
			shape.drawShape();
		}		
	}

}
