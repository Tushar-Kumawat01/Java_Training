package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 10, 2025
* Time	 : 12:43:05 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Book {
	
	String title,author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
}
