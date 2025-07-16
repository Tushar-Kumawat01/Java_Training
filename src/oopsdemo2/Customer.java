package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 3:04:01 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

//Single inheritance example - Parent class
public class Customer {
	
	private String name;
    private String email;
    
    public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void display(){
        System.out.println("********** Customer Details ************");
        System.out.println("Customer Name    : "+name);
        System.out.println("Email            : "+email);
    }
}
