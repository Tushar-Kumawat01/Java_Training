package oopsdemo3;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 10:14:16 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Student {

	private int rollNo;
	private String name;
	private static String college="UPES"; //static variable
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public static void collegeChange() { college ="VTU"; }
	
	 public void display(){
	        System.out.println(this.rollNo+" "+this.name+" "+college);
	 }
}
