package oopsdemo4;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 3:01:17 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Rectangle implements IShape{

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
		
	}

	@Override
	public double getArea() {
		
		return this.height*this.width;
	}
	
}
