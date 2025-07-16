package java8features;

/**
* Author : Tushar.Kumawat
* Date   : Jul 16, 2025
* Time	 : 10:16:34 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class LamdaDemo3 {

	public static void main(String[] args) {
		
		INumericTest isEven =(n) -> (n%2 == 0);
		INumericTest isNegative = (n) ->(n<0);
		
		System.out.println("7 is Even Number :"+isEven.computeTest(7));
		System.out.println("-55 is Negative Number : "+isNegative.computeTest(-55));
		
		//boolean a=(n) -> (n%2 == 0);  //- lambda expression should be stored in instace of FI
		
	}

}
