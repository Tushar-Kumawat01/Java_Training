package java8features;

/**
 * Author : Tushar.Kumawat
 * Date   : Jul 16, 2025
 * Time	 : 11:19:31 AM
 * Email	 : Tushar.Kumawat@coforge.com
 */

//Program to demonstrate Method reference to an instance method of a class

@FunctionalInterface
interface IDemo
{
	void sum(int  x,int y);
}

class Calculation
{
	void addition(int  a,int b)
	{
		System.out.println("The Addition is : "+(a+b));
	}
}

public class MethodReferenceDemo2 {

	public static void main(String[] args) {

		Calculation c1=new Calculation();

		//using Lambda expressions
		IDemo d1=(a,b)->System.out.println("The Addition is : "+(a+b));
		d1.sum(10, 45);

		//Using Method reference to call instance method
		IDemo d2=c1::addition;
		d2.sum(200,150);

	}

}
