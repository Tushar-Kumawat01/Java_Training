package oopsdemo2;

import java.util.Scanner;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 4:31:38 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class MultilevelDemo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Account Details of Customer(Cust No. , Name , Min Bal & Balance : ");
		System.out.println("Enter Customer Number : ");
		int custNo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Customer Name : ");
		String name = scanner.nextLine();
	    final int MIN_BAL = 1000;
	    System.out.println("Enter Balance Amount : ");
		int balance = scanner.nextInt();
		System.out.println("Enter Amount to Deposit : ");
		int deposit = scanner.nextInt();
		System.out.println("Enter Amount to Withdraw : ");
		int withdraw = scanner.nextInt();
		
		AccountDetails ac1 = new AccountDetails(custNo, name, MIN_BAL,balance, deposit, withdraw);
		
		ac1.display(); //invoke display() method of AccountDetails
		scanner.close();

	}

}
