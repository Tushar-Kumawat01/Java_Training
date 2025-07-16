package oopsdemo1;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 11:39:47 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

//Java program to demonstrate constructors
public class TraineeTest {

	public static void main(String[] args) {
		
		Trainee t1 = new Trainee();
		t1.display();
		
		Trainee t2 = new Trainee(222,"Rod Johnson","Spring",7000);
		t2.display();
		
		Trainee t3 = new Trainee(333,"Gavin King","Hibernate",6000);
		t3.display();
		
		Trainee t4 = new Trainee(333,"Gavin King","Hibernate",6000);
		t4.display();
		
		//checks two objects t3 and t4 , by using hashCode and equals methods
		//of the instance class
		if(t3.equals(t4))
		{
			System.out.println("Objects t3 and t4 are Equal");
		}
		else
		{
			System.out.println("Object t3 and t4 are Not Equal");
		}
		
		//checks two objects t1 and t4 , by using hashCode and equals methods
		//of the instance class , which are overridden there
		if(t1.equals(t4))
		{
			System.out.println("Objects t1 and t4 are Equal");
		}
		else
		{
			System.out.println("Object t1 and t4 are Not Equal");
		}
	}

}
