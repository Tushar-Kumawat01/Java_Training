package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 4:00:58 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Manager extends Staff {
	
	protected float da;
	private float gross;

	public Manager(int empId, String name, float salary) {
		super(empId, name, salary);
	}
	
	void getDA()
	{
		da=(salary*80)/100;
		System.out.println("DA is : "+da);
	}
	
	void getGross()
	{
		gross = salary + hra + da;
		System.out.println("Gross Salary of Manager is : "+gross);
	}

}
