package oopsdemo1;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 12:16:31 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class TimeTest {

	public static void main(String[] args) {
		
		Time t1 = new Time(22,10,60);
		Time t2 = new Time(11,5,60);
		
		t1.addTime(t2);
		t1.display();
	}

}
