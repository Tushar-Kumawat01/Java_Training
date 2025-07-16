package oopsdemo4;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 2:58:00 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Circle implements IShape{
	
	private double radius;

	//generate constructor using fields
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}

	@Override
	public double getArea() {
	
		return Math.PI*this.radius*this.radius;
	}

	//generate getter for radius
	public double getRadius() {
		return radius;
	}
	
}
