package oopsdemo1;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 10:18:54 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class ThisDemo {

	int age;
	
	//instance method
	//this keyword is used in instance method to access object
	void init(int age)
	{
		// here "this" keyword is referring to the object that has 
		// called this particular method
		this.age= age;
	}
	
	public static void main(String[] args) {
	
		ThisDemo td1 = new ThisDemo();
		td1.init(28); //when calling this the value of "this" keyword will refer to "td1".
		
		System.out.println("The value of the age is : "+ td1.age);
		
		ThisDemo td2 = new ThisDemo();
		td2.init(10);//when calling this the value of "this" keyword will refer to "td2".
		
		System.out.println("The value of the age is : "+ td2.age);

	}
}
