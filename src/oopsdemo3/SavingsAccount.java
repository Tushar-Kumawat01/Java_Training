package oopsdemo3;

/**
* Author : Tushar.Kumawat
* Date   : Jul 10, 2025
* Time	 : 4:19:44 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class SavingsAccount extends Account{

	private double interestRate;

	public SavingsAccount(String name, double balance, double interestRate) {
		super(name, balance);
		this.interestRate = interestRate;
	}
	
}

class CheckingAccount extends Account{
	
	private double overDraft; //pre-sanctioned loan

	public CheckingAccount(String name, double balance, double overDraft) {
		super(name, balance);
		this.overDraft = overDraft;
	}

	@Override
	void withdraw(double amt) {
		
		System.out.println("Overdraft Amount: " + overDraft);
		if (amt <= balance) {
			balance -= amt;
			System.out.println("Withdrawing: " + amt);
		} else if ((amt > balance) && (amt > (balance + overDraft))) {
			System.out.println("Sorry! You cannot withdraw");
		} else {
			double result = amt - balance;
			overDraft -= result;
			balance = 0;

			System.out.println("Withdrawing: " + amt);
			System.out.println("Current Overdraft Amount: "
					+ overDraft);
		}
	}
}