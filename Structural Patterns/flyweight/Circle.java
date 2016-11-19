package com.designPattern.flyweight;

public class Circle implements Shape{
	private String color;
	private int X; 
	private int Y;
	private int radius; 
	
	public Circle(String color){
		this.color = color;
	}
	
	public void setX(int x){
		this.X = x; 
	}
	
	public void setY(int y){
		this.Y = y;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle with: "+ "X: " + X + " Y: " + Y + " Radious: " + radius + " of color: " + color);
	}
	
}
