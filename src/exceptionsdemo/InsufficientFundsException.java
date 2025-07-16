package exceptionsdemo;

/**
* Author : Tushar.Kumawat
* Date   : Jul 12, 2025
* Time	 : 12:34:59 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

/*
 * User Defined Exceptions - - Class should extend root class Exception
 */
public class InsufficientFundsException extends Exception{

	private double amount;

	//generate constructor
	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	//generate getter
	public double getAmount() {
		return amount;
	}
}
