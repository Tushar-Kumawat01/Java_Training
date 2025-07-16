package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 10, 2025
* Time	 : 12:14:47 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

/**
* In Java, aggregation represents HAS-A relationship,  
* which means when a class contains reference of another class known to have aggregation.
* 
* When you want to use some property or behaviour of any class without the requirement of modifying it 
* or adding more functionality to it, in such case Aggregation 
*/
public class Book100 {

	 String name;
	 int price;
	 
	 //Aggregation
	 Author author;
	 Publisher publisher;
	 
	 
	 public Book100(String name, int price, Author author, Publisher publisher) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}


	void display()
	 {
			System.out.println("*************** Book Details ****************");
			System.out.println("Book Name    : "+name);
		    System.out.println("Book Price   : "+price);
		    
		    System.out.println("------------Author Details----------");
		    System.out.println("Author Name  : "+author.authorName);
		    System.out.println("Author Age   : "+author.age);
		    System.out.println("Author place : "+author.place);
		    
		    System.out.println("------------Publisher Details-------");
		    System.out.println("Publisher Name: "+publisher.name);
		    System.out.println("Publisher ID  : "+publisher.publisherID);
		    System.out.println("Publisher City: "+publisher.city);
		    
	}
}
