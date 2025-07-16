package oopsdemo4;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 11:47:17 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Marks extends Trainee{
	
	private double marks;

	public Marks(String name, String address, int number, double marks) {
		super(name, address, number);
		this.marks = marks;
	}

	@Override
	public double calculateMarks() {
		System.out.println("Calculate Marks : ");
		return (marks*2);
	}
	
	
}
