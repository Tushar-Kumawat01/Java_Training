package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 4:24:03 PM
* Email	 : Tushar.Kumawat@coforge.com
*/


//Multi-level inheritance
public class Account { //base class for SavingsBank
	
	int accNo;
	String name;
	public Account(int accNo, String name) {
		super();
		this.accNo = accNo;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("************ Account Details ************");
		System.out.println("Account Number :"+accNo);
		System.out.println("Customer Name :"+name);
	}

}
