package oopsdemo1;

/**
* Author : Tushar.Kumawat
* Date   : Jul 8, 2025
* Time	 : 12:55:12 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.inputStudentDetails();
		student2.inputStudentDetails();
		student3.inputStudentDetails();
				
		float tot1 =student1.calculateTotalMarks();
		float tot2 =student2.calculateTotalMarks();
		float tot3 =student3.calculateTotalMarks();
		
		student1.displayStudentDetails();
		System.out.println("Display Total Marks returned to Main: "+tot1);
		
		student2.displayStudentDetails();
		System.out.println("Display Total Marks returned to Main: "+tot2);
		
		student3.displayStudentDetails();
		System.out.println("Display Total Marks returned to Main: "+tot3);
	}

}
