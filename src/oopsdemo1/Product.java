package oopsdemo1;

/**
* Author : Tushar.Kumawat
* Date   : Jul 8, 2025
* Time	 : 4:13:53 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Product {

	private int productId;
	private String productName;
	private int quantity;
	private float price;
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float totalAmount()
	{
		float total = price * quantity;
		return total;
	}
	
	public void displayTotalBill()
	{
		System.out.println("************* Total Bill ***************");
		System.out.println("Product Id   : "+ productId);
		System.out.println("Product Name : "+ productName);
		System.out.println("Quantity     : "+ quantity);
		System.out.println("Price        : "+ price);
	}
	
}
