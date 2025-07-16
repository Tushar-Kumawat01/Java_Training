package java8features;

/**
* Author : Tushar.Kumawat
* Date   : Jul 16, 2025
* Time	 : 9:55:02 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

@FunctionalInterface
interface MyFI{
	public String sayHello(); //by default abstract
	//public String sayHello1();
}


public class LambdaDemo1 {

	public static void main(String[] args) {
		
		MyFI msg = () -> {return "Hello World";}; // lambda expression
		
		System.out.println(msg.sayHello());
	}

}
