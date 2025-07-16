package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 2:44:00 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

//Child Class -  Inheritance IS-A relationship
public class Developer extends Employee {
	
	private String technology;
	
	public Developer(int empId, String name,String tech) {
		super(empId, name); //invokes Parent class constructor
		this.technology = tech;
	}
	
	void display1()
	{
		System.out.println("Technology Used : "+technology);
	}

}
