package java8features;

/**
* Author : Tushar.Kumawat
* Date   : Jul 15, 2025
* Time	 : 4:35:46 PM
* Email	 : Tushar.Kumawat@coforge.com
*/


public class CoVariantDemo {

	public static void main(String[] args) {
		
        Record r=new Record();
		System.out.println(r.listOfName());
		
		System.out.println("*****************");
		Student s1=new Student();
		System.out.println(s1.listOfName());

	}

}
