package oopsdemo3;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 10:25:33 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

/**
*Final Variable- Variable content cannot be modified
* Final method - A final method cannot be overridden
* Final class - Cannot extend a Final class
*/

final class Demo{
	
	final void display() {
		System.out.println("Hello World");
	}
}

//final classes can't be extended
//class MyDemo extends Demo{
//	
//	final void display() //final methods can't be overriden
//	{
//		System.out.println("final World");
//	}
//}
//

public class FinalDemo {

	public static void main(String[] args) {
	
		final int AGE = 20;
		//AGE =25; //Final variables can't be modified

	}

}
