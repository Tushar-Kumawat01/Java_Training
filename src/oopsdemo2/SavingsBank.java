package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 4:25:38 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class SavingsBank extends Account{

	private int min_bal;
	protected int balance;
	
	public SavingsBank(int accNo, String name, int min_bal, int balance) {
		super(accNo, name);
		this.min_bal = min_bal;
		this.balance = balance;
	}
	
	void display()
	{
	    super.display(); // invoke super class method
	    System.out.println ("Minimum Balance: "+min_bal);
        System.out.println ("Saving Balance: "+balance);
    }
}
