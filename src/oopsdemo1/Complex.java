package oopsdemo1;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 11:50:02 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Complex {

	double real;
	double imaginary;
	
	
	public Complex(double real, double imaginary) //parameterized constructor
	{
		
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void add(Complex obj) //method which accepts object as an argument
	{
		// c1.real += c2.real
		this.real += obj.real;
		this.imaginary += obj.imaginary;
	}
	
	public void display()
	{
		System.out.println("r"+this.real +" + i"+this.imaginary);
	}
	
}
