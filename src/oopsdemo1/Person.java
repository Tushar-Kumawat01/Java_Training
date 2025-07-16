package oopsdemo1;

/**
* Author : Tushar.Kumawat
* Date   : Jul 8, 2025
* Time	 : 2:35:42 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Person {

	int id,age;
	String name,city,gender;
	
	//Methods/actions/functions/behavior
	public void eat() {
		System.out.println(name+" is Eating");
	}
	
	public void study() {
		System.out.println(name+" is Studying");
	}
	
	public void sleep() {
		System.out.println(name+" is Sleeping");
	}	
	
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		
		person1.name="James Gosling";
		person2.name="Gavin King";
		person3.name="Rod Johnson";
		
		person1.eat();
		person1.study();
		person1.sleep();
		System.out.println();
		
		person2.eat();
		person2.study();
		person2.sleep();
		System.out.println();
		
		person3.eat();
		person3.study();
		person3.sleep();
		System.out.println();
	}
	
}
