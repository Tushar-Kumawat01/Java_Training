package collectionsdemo;

/**
* Author : Tushar.Kumawat
* Date   : Jul 14, 2025
* Time	 : 2:21:41 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Book {

	public int id;
	public String name,author,publisher;
	public int quantity;
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getQuantity() {
		return quantity;
	}
}
