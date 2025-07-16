package java8features;

/**
 * Author : Tushar.Kumawat
 * Date   : Jul 16, 2025
 * Time	 : 10:24:20 AM
 * Email	 : Tushar.Kumawat@coforge.com
 */

//Block Lambda Expression
public class LambdaDemo4 {

	public static void main(String[] args) {
		
		//lambda expression
		IMyString reverseStr = (str) -> {
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		};

		System.out.println(reverseStr.myStringFunction("Lambda EXpressions"));
		System.out.println(reverseStr.myStringFunction("madam"));
		System.out.println(reverseStr.myStringFunction("Hello World Java"));

		// lambda expression with single parameter
		IMyString myName = (name) -> { return "Hello "+name;};

		System.out.println(myName.myStringFunction("Raj"));

		// lambda expression with single parameter with no parenthesis
		IMyString myName1 = name -> { return "Hello "+name;};

		System.out.println(myName1.myStringFunction("James Gosling"));

		IMyString lenString = (str) -> { return "The Length of "+str+" is :"+str.length();};
		System.out.println(lenString.myStringFunction("Lambda Expression"));
		System.out.println(lenString.myStringFunction("James Gosling"));
		System.out.println(lenString.myStringFunction("Raj"));

	}

}
