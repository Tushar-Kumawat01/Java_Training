package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 4:07:35 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Director extends Manager {
	
	private float ta,gross;
	
	public Director(int empId, String name, float salary) {
		super(empId, name, salary);
	}
	
	void getTA()
	{
		ta=(salary*30)/100;
		System.out.println("TA is : "+ta);
	}
	
	void getGross()
	{
		gross = salary + hra + da + ta;
		System.out.println("Gross Salary of Director is : "+gross);
	}

}
