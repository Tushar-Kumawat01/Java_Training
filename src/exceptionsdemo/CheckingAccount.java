package exceptionsdemo;

/**
 * Author : Tushar.Kumawat
 * Date   : Jul 12, 2025
 * Time	 : 12:39:30 PM
 * Email	 : Tushar.Kumawat@coforge.com
 */

public class CheckingAccount {

	private double balance;
	private int number;

	//generate constructor using fields
	public CheckingAccount(int number) {
		this.number = number;
	}

	//generate getters
	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	// method may throw user defined exception - InSufficientFundsException
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount <= balance) {
			balance -= amount;
		}else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
}