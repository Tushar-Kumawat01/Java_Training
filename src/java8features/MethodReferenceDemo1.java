package java8features;

/**
* Author : Tushar.Kumawat
* Date   : Jul 16, 2025
* Time	 : 10:39:24 AM
* Email	 : Tushar.Kumawat@coforge.com
*/


@FunctionalInterface
interface MyInterface
{
	void myMethod(int a);
}

class Test //Instance class
{
	void display(int x) //instance method
	{
		System.out.println("I am an Instance Method"+x);
	}
}


public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		
		//traditional approach
		Test t1 = new Test();
		t1.display(100);
		
		//Java8 Method Reference approach
		MyInterface m1ref = t1::display; // method reference to instance method of object
		
		//calling method of FI
		m1ref.myMethod(200);

		
		// Lambda -----> FI
		// MR --- shorthand of lambda
		// MR -->FI
	}

}
