package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 10, 2025
* Time	 : 9:34:30 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Customer1 {

	private String name;
    private String email;
    
    public Customer1(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void display(){
        System.out.println("********** Customer Details ************");
        System.out.println("Customer Name    : "+name);
        System.out.println("Email            : "+email);
    }
}
