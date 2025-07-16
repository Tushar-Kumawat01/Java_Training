package oopsdemo3;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 9:26:54 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class OverrideDemo3 {
	
	public static void main(String[] args) {
		
		ElectronicsProduct laptop=new ElectronicsProduct("Laptop",999.90,"Dell","Inspiron");
        ClothingProduct tShirt=new ClothingProduct("T-Shirt",15.45,"Medium","Red");

        System.out.println("-- Electronics Product Details ---");
        laptop.displayDetails();

        System.out.println("-- Clothing Product Details ---");
        tShirt.displayDetails();
	}

}
