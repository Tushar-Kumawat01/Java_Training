package oopsdemo4;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 3:06:06 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class ShapeTest {

	public static void main(String[] args) {
		
		//programming for interfaces not implementation
		IShape ishape = new Circle(10);//up-casting
		
		System.out.println("Using Interface : "+IShape.LABLE);
		
		ishape.draw();
		
		System.out.println("Area of circle with radius is : "+ishape.getArea());
		
		//switching from one implementation to another easily
		ishape = new Rectangle(10, 7); //up-casting
		
		ishape.draw();
		System.out.println("Area of Rectangle is : "+ishape.getArea());

	}

}
