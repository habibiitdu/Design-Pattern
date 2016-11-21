package com.designPattern.composite;

import java.util.ArrayList;

public class GraphicsEditor {
	public static void main(String args[]){
		ArrayList<Shape> allShapesInSoftware = new ArrayList<Shape>();
		
		Shape line1 = new Line(1, 1, 1, 1); 
		Shape line2 = new Line(3, 3, 3, 3);
		Shape rectangle = new Rectangle(); 
		Circle circle1 = new Circle(10, 10, 15); 
		Circle circle2 = new Circle(5, 5, 10); 
		
		allShapesInSoftware.add(line1);
		allShapesInSoftware.add(rectangle);
		allShapesInSoftware.add(line2); 
		
		ComplexShape complexShape = new ComplexShape();
		complexShape.addToShape(line1);
		complexShape.addToShape(rectangle);
		complexShape.addToShape(line2);
		complexShape.addToShape(circle2);
		
		allShapesInSoftware.add(complexShape);
		
		ComplexShape moreComplexShape = new ComplexShape();
		moreComplexShape.addToShape(complexShape);
		moreComplexShape.addToShape(circle1);
		moreComplexShape.addToShape(rectangle);
		
		allShapesInSoftware.add(moreComplexShape); 
		
		RenderShapes(allShapesInSoftware);
		
	}
	
	private static void RenderShapes(ArrayList<Shape> shapesList){
		System.out.println("All data points are only for considerations.");
		System.out.println();
		for (Shape shape : shapesList) {
			shape.drawShape();
			System.out.println("---------------------");
		}
	}
}
