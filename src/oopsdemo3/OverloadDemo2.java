package oopsdemo3;

/**
* Author : Tushar.Kumawat
* Date   : Jul 10, 2025
* Time	 : 3:01:20 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class OverloadDemo2 {

	public static void main(String[] args) {
		
			Outlet outlet=new Outlet();
	        System.out.println("---------------------------------------------");
	        //Add Product with only Name & price
	        outlet.addProduct("T-Shirt",20.50);
	         //oulet.addProduct("T-Shirt",20.50);
	        System.out.println("---------------------------------------------");
	        //Add Product with only Name ,price, quantity
	        outlet.addProduct("Jeans",45.50,100);
	        System.out.println("---------------------------------------------");
	        //Add Product with only Name , price, quantity, category
	        outlet.addProduct("Sneakers",75.50,30,"Footwear");
	        System.out.println("---------------------------------------------");

	}

}
