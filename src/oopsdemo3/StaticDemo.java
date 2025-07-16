package oopsdemo3;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 10:03:25 AM
* Email	 : Tushar.Kumawat@coforge.com
*/


class Count{

		private static int cnt;//static variable 
		private int a; //instance variable
		
		Count(){
			cnt++;
			a=100;
		}
		
		//Static method = it can only use static variables
		public static void display() {
			System.out.println("The Number of Objects created : "+cnt);
		}
		
		public void print() {
			System.out.println("Instance method variable : "+a);
		}
}


public class StaticDemo {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		c1.print(); //Invokes instance methods
		
		Count.display(); //Invokes Static methods
		

	}

}
