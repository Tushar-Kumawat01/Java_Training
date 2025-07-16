package oopsdemo1;

import java.util.Scanner;

/**
* Author : Tushar.Kumawat
* Date   : Jul 8, 2025
* Time	 : 12:46:43 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

//Instance class - Encapsulation
public class Student {
	
	private int rollNumber;
	private String firstName,lastName;
	private float[] marks = new float[5];
	private float total;
	
	Scanner scanner = new Scanner(System.in);
	
	public void inputStudentDetails()
	{
		System.out.println("Enter Roll Number of a Student");
		rollNumber = scanner.nextInt();
		
		System.out.println("Enter First Name & Last Name of a Student");
		firstName = scanner.next();
		lastName = scanner.next();
		
		System.out.println("Enter marks of 5 subjects");
		for (int i = 0; i < marks.length; i++) {
			marks[i]= scanner.nextFloat();
		}
		
	}
		
		
	public float calculateTotalMarks()
	{
		for (int i = 0; i < marks.length; i++) {
			total += marks[i];
		}
		return total;
	}
	
	public void displayStudentDetails()
	{
		System.out.println("********* Student Result Information ***********");
		System.out.println("Roll Number     :"+rollNumber);
		System.out.println("Full Name       :"+firstName+" "+lastName);
		System.out.println("Total Marks     :"+total);
		System.out.println("************************************************");
	}
	
}
