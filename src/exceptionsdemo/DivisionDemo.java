package exceptionsdemo;

import java.util.Scanner;

/**
 * Author : Tushar.Kumawat
 * Date   : Jul 12, 2025
 * Time	 : 10:30:20 AM
 * Email	 : Tushar.Kumawat@coforge.com
 */

//program to perform division of 2 nos without exception handling
public class DivisionDemo {

	public static void main(String[] args) {

		int a, b, result;
		Scanner input = new Scanner(System.in);

		System.out.println("Input two integers");
		a = input.nextInt();
		b = input.nextInt();  // enter 0

		try //statements to be monitored which may throw exception
		{
			result = a / b;  // JRE Throws Arithmetic exception
			System.out.println("Result = " + result); 
		} 
		catch (ArithmeticException e) //Exception thrown is handled in catch block 
		{
			System.err.println("Divide by zero error - Enter non-zero value");
			System.err.println("Exception description : "+e.getMessage());
			System.err.println("Exception Name & description : "+e.toString());
			//details about exception NAme , Description  , LineNUmber of code which generated exception
			e.printStackTrace();
		}
		finally // clean-up operation
		{
			input.close();
			System.out.println("In Finally Block - Program execution ended");
		} 
		input.close();
	}
}
