package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 3:14:42 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class ShoppingApplication {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart("Mary John", "mary@wipro.com");
		
		cart.addItem("Dell Laptop");
		cart.addItem("Boat Headphone");
		cart.addItem("Logitech Mouse");
		
		cart.display();
		System.out.println("---------- Cart Details --------------");
		cart.displayCart();
	}
}
