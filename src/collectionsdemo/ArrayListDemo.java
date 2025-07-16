package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author : Tushar.Kumawat
 * Date   : Jul 14, 2025
 * Time	 : 12:32:14 PM
 * Email	 : Tushar.Kumawat@coforge.com
 */

public class ArrayListDemo {

	public static void main(String[] args) {

		//generic arrayList
		ArrayList<String> a1 = new ArrayList<String>();

		//add elements to arrayList & it maintains the order of insertion
		a1.add("Java");
		a1.add("Perl");
		a1.add("C++");
		a1.add("C# 5.0");
		a1.add("Java"); //duplicate elements
		a1.add("Python");

		System.out.println(a1);

		//get elements by index
		System.out.println("Element at index 1 : "+ a1.get(1));

		System.out.println("Does list contains elements Java ? :"+a1.contains("Java"));


		//add elements at specific index
		a1.add(2,"Oracle");
		System.out.println(a1);

		System.out.println("Is Arraylist Empty ? :"+a1.isEmpty());
		System.out.println("Index of Perl :"+a1.indexOf("Perl"));
		System.out.println("Size of Arraylist : "+a1.size());

		// Collections is a Utility Class
		Collections.sort(a1);
		System.out.println("Array List after Sorting :"+a1);

		//a1.add(100); // compiler error

		ArrayList<Integer> a2=new ArrayList<Integer>();//default size is 10

		a2.add(100);
		a2.add(500);
		a2.add(73);
		a2.add(66);
		a2.add(350);
		a2.add(73);

		System.out.println(a2);
		System.out.println("Size :"+a2.size());
		


	}

}
