package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 3:56:49 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Staff {
	
	private int empId;
	private String name;
	protected float salary,hra;
	
	public Staff(int empId, String name, float salary) {
		
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	void getHRA()
	{
		hra = (salary*60)/100;
		System.out.println("HRA : "+hra);
	}
	
	void display()
	{
		System.out.println(empId+" "+name+" "+salary);
	}
	
	void print()
	{
		System.out.println("Gross Salary of Staff :"+(salary+hra));
	}
	
}




