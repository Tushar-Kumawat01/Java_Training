package java8features;

import java.time.LocalDate;

/**
 * Author : Tushar.Kumawat
 * Date   : Jul 16, 2025
 * Time	 : 11:53:33 AM
 * Email	 : Tushar.Kumawat@coforge.com
 */

//Java8 allows to add functionality to Interfaces
interface IParser{ 

	default void parse(){ 
		System.out.println("Default Parsing logic"); 
	} 

	static void displayDate()
	{
		System.out.println(LocalDate.now());
	}

	// void test(); 
}

class TextParser implements IParser
{
	//inherit default implementation of Parse

	void display()
	{
		System.out.println("Hello Text Parser");
	}
}

class XMLParser implements IParser
{
	//Overridden method
	public void parse(){ 
		System.out.println("Parsing XML Files"); 
	} 
}

public class DefaultMethodsDemo2 {
   
	public static void main(String[] args) {
		
		IParser p=new TextParser();  // Up casting
		p.parse(); // invoke default method in interface

		TextParser p1=new TextParser();// references child class TExtParser
		p1.display();

		p=new XMLParser(); // references child class XMLParser
		p.parse(); // invokes overridden method

		System.out.println("Program executed on :");
		IParser.displayDate();  // invoke static method
	}

}
