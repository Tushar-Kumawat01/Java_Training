package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 3:06:19 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class ShoppingCart extends Customer {

	private String[] items;
	private int itemCount;

	
	public ShoppingCart(String name, String email) {
		super(name, email);
		items = new String[10];
		itemCount = 0;
	}

	public void addItem(String item){
		if(itemCount < items.length){
			items[itemCount]=item;
			itemCount++;
			System.out.println(item+" Added to Cart");
		}else {
			System.out.println("Cart is Full. Cannot Add More Items.");
		}
	}

	
	public void displayCart(){
		System.out.println("Items in Cart: ");
		for (int i = 0; i < itemCount; i++) {
			System.out.println(items[i]);
		}
	}
}
