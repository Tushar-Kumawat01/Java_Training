package oopsdemo3;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 9:17:31 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class ElectronicsProduct extends Product{

	private String brand;
	private String model;
	
	public ElectronicsProduct(String name, double price, String brand, String model) {
		super(name, price);
		this.brand = brand;
		this.model = model;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Brand : "+ brand);
		System.out.println("Model : "+ model);
		System.out.println("Warranty : 1 year");
	}
	
}
