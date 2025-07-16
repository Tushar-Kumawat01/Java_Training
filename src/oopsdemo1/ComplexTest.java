package oopsdemo1;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 11:54:59 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class ComplexTest {

	public static void main(String[] args) {
		
		Complex c1 = new Complex(2,4);
		Complex c2 = new Complex(3,5);
		Complex c3 = new Complex(7,2);
		
		c1.add(c2); //calls method add() by passing object c2
		System.out.println("The addition of 2 Complex Numbers is : ");
		c1.display();
		
		c1.add(c3);
		System.out.println("The addition of 2 Complex Numbers is : ");
		c1.display();
	}

}
