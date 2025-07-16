package exceptionsdemo;

/**
* Author : Tushar.Kumawat
* Date   : Jul 12, 2025
* Time	 : 12:44:24 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class UserDefinedExceptionsDemo {

	public static void main(String[] args) {
		CheckingAccount ck1=new CheckingAccount(101);

        System.out.println("Depositing 5000$ ...........");
        ck1.deposit(5000);

        try{
            System.out.println("Withdrawing 2000$.........");
            ck1.withdraw(2000);

            System.out.println("Withdrawing 5000$.........");
            ck1.withdraw(5000);
        }
        catch (InsufficientFundsException e){
            System.out.println("Sorry InSufficient Balance : "+ ck1.getBalance());
            e.printStackTrace();
        }
	}

}
