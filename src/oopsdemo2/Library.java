package oopsdemo2;

import java.util.List;

/**
* Author : Tushar.Kumawat
* Date   : Jul 10, 2025
* Time	 : 12:44:34 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

//Composition Example
public class Library {

	List<Book> books; //Object Reference - Composition

	//Constructor to initialize books in Library
	public Library(List<Book> books) {
		super();
		this.books = books;
	}
	
	//getter() method to getBooks in Library
	public List<Book> getBooks()
	{
		return books;
	}
}
