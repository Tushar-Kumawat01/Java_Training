package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 2:50:11 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		//create objects of child class
		Developer d1 = new Developer(101, "James Gosling", "JDBC"); //invoke derived class constructor
		Developer d2 = new Developer(105, "Rod Johnson", "Spring Framework");
		
		d1.display(); //child class object invokes parent class method - Inheritance
		d1.display1(); //child class object invoke child class method
		
		d2.display();
		d2.display1();
		
		Employee e1 = new Employee(106,"Mike");
		e1.display();

	}

}
