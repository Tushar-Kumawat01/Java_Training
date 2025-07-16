package oopsdemo3;

/**
 * Author : Tushar.Kumawat
 * Date   : Jul 10, 2025
 * Time	 : 3:52:50 PM
 * Email	 : Tushar.Kumawat@coforge.com
 */


class Bank //base class
{
	private String name;


	public Bank(String name) {
		this.name = name;
	}

	int getRateofInterest()
	{
		return 0;
	}

	void display(){
		System.out.println("Welcome to "+name+" Bank");
	}
}


class SBI extends Bank
{

	public SBI(String name) {
		super(name);
	}

	int getRateofInterest() // overridden method
	{
		return 5;
	}
}

class ICICI extends Bank
{

	public ICICI(String name) {
		super(name);
	}

	int getRateofInterest() // overridden method
	{
		return 6;
	}
}

class Axis extends Bank
{

	public Axis(String name) {
		super(name);
	}

	int getRateofInterest() // overridden method
	{
		return 4;
	}

}

public class OverridingDemo {

	public static void main(String[] args) {

		SBI sbiBank=new SBI("SBI");
		ICICI iciciBank=new ICICI("ICICI");
		Axis axisBank=new Axis("Axis");

		sbiBank.display();
		System.out.println("The Interest Rate of SBI is : "+sbiBank.getRateofInterest()); // invoke overridden method

		iciciBank.display();
		System.out.println("The Interest Rate of ICICI is : "+iciciBank.getRateofInterest());

		axisBank.display();
		System.out.println("The Interest Rate of Axis is : "+axisBank.getRateofInterest());
	}
}
