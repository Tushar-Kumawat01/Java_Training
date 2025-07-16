package oopsdemo4;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 11:54:29 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trainee t1= new Marks("John","New York",1001,35); // up casting
		
		t1.show();
		double marks = t1.calculateMarks();
		System.out.println(t1 +" " + marks);
	}

}
