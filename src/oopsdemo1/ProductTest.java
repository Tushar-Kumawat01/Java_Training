package oopsdemo1;

/**
* Author : Tushar.Kumawat
* Date   : Jul 8, 2025
* Time	 : 4:20:49 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class ProductTest {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		
		
		product1.setProductId(121);
		product1.setProductName("Classmate NoteBook");
		product1.setPrice(85);
		product1.setQuantity(8);
		product1.displayTotalBill();
		float total1 = product1.totalAmount();
		System.out.println("Total Amount : "+ total1);
		
		
		product2.setProductId(122);
		product2.setProductName("Pentonic Pen");
		product2.setPrice(15);
		product2.setQuantity(12);
		product2.displayTotalBill();
		float total2 = product2.totalAmount();
		System.out.println("Total Amount : "+ total2);
		
		
		product3.setProductId(123);
		product3.setProductName("Geometry Box");
		product3.setPrice(65);
		product3.setQuantity(7);
		product3.displayTotalBill();
		float total3 = product3.totalAmount();
		System.out.println("Total Amount : "+ total3);
	}
}
