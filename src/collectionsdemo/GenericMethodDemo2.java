package collectionsdemo;

/**
 * Author : Tushar.Kumawat
 * Date   : Jul 14, 2025
 * Time	 : 11:50:21 AM
 * Email	 : Tushar.Kumawat@coforge.com
 */

public class GenericMethodDemo2 {

	//Syntax: <type-parameter> return_type method_name (parameters) {...}
	<T> void show(T a)   // generic method
	{
		System.out.println("The generic value is : "+a);
	}

	<V,T> void hello(V a,T b)
	{
		System.out.print(a.getClass().getName()+" = "+a+" ");
		System.out.println(b.getClass().getName()+" = "+b);
	}


	public static void main(String[] args) {

		GenericMethodDemo2 gd=new GenericMethodDemo2();

		gd.show(100);
		gd.show(1000.50);
		gd.show("Generics in Java");
		gd.show('A');
		gd.show(true);
		gd.show(10.0f);
		gd.show(10L);

		System.out.println();

		gd.hello(101, "James Gosling");
		gd.hello("Rod Jhonson","Spring");
		gd.hello("Java", 8);
		gd.hello(120, 200.50);
	}

}
