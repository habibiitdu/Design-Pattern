package com.designPattern.flyweight;

import java.util.HashMap;

public class ShapeFactory {
	private static final HashMap<String, Circle> colorCicles = new HashMap<>(); 
	
	public static Circle getCircle(String color){
		Circle requiredCircle = colorCicles.get(color); 
		if(requiredCircle == null){
			 requiredCircle = new Circle(color);  
			 colorCicles.put(color, requiredCircle); 
			 System.out.println("Creating circle of color: " + color);
		}
		return requiredCircle; 
	}
}
