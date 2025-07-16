package oopsdemo1;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 11:13:19 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

/*
 * Constructor is a special method with the same name of a class, 
 * which initializes an Object properties.
 * Same name as the class and no return type.
 * Special Method invoked whenever an instance/object of a given class is created. 
 */

public class ConstructorDemo {

	int id;
	String name;
	float salary;
	
	ConstructorDemo() //implicit constructor
	{
		System.out.println("I am Implicit Constructor");
		id = 101;
		name = "Mike";
		salary = 5000.00f;
	}
	
	
	//generate constructor with arguments
	//source>generate constructor using fields
	//select all generate button
	public ConstructorDemo(int id, String name, float salary) //Parameterized Constructor
	{
		System.out.println("I am Parameterized Constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(this.id+" "+this.name+" "+this.salary);

	}
	
	
	public static void main(String[] args) {
		
		ConstructorDemo cd1 = new ConstructorDemo();  //invokes implicit constructor
		ConstructorDemo cd2 = new ConstructorDemo(102,"John",6000.00f); // invoke parameterized constructor
		ConstructorDemo cd3 = new ConstructorDemo();
		ConstructorDemo cd4 = new ConstructorDemo();
		
		cd1.display();
		cd2.display();
		cd3.display();
	}
}
