package oopsdemo3;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 9:12:11 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Product {

	private String name;
    private double price;
    
    
    public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}


	// Method to display product details
    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
}

