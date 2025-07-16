package oopsdemo3;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 10:17:19 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class StaticDemo2 {

	public static void main(String[] args) {
		
		//Invoke static method even before creating object
		Student.collegeChange();
		
		Student s1 = new Student(101,"Mike");
		Student s2 = new Student(102,"John");
		Student s3 = new Student(103,"Mary");
		
		s1.display();
		s2.display();
		s3.display();

	}

}
