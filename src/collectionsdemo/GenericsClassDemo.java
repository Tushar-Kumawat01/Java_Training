package collectionsdemo;

/**
* Author : Tushar.Kumawat
* Date   : Jul 14, 2025
* Time	 : 11:18:51 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

class Sample<T> //Parameterized class / Generic class / Generic T-Type
{

	private T data; //generic variable declaration

	public Sample(T data) { //generic constructor
		this.data = data;
	}

	public T getData() { //getter with generic return type
		return data;
	}

	public void setData(T data) { //setter with generic type parameter
		this.data = data;
	}
}


public class GenericsClassDemo{
	
	public static void main(String[] args) {
		
		Sample<String> s1 = new Sample("Java Generics"); //Object of Generic class for Type String
		System.out.println("Display from Generic class by passing String Object : "+s1.getData());
		
		Sample<Integer> s2 = new Sample(200); //Object of Generic class for Type Integer
		System.out.println("Display from Generic class by passing Integer Object : "+s2.getData());
		
		Sample<Double> s3 = new Sample(550.50);//Generic class for Type Double
		System.out.println("Display from Generic class by passing Double Object : "+s3.getData());
		
		
	}
}