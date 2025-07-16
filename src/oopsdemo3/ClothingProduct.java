package oopsdemo3;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 9:21:11 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class ClothingProduct extends Product {
	
	private String size;
	private String color;
	
	public ClothingProduct(String name, double price, String size, String color) {
		super(name, price);
		this.size = size;
		this.color = color;
	}

	@Override
	public void displayDetails() {
			super.displayDetails();
	        System.out.println("Size: " + size);
	        System.out.println("Color: " + color);
	        System.out.println("Material: Cotton");
	}

}
