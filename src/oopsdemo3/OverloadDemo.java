package oopsdemo3;

/**
* Author : Tushar.Kumawat
* Date   : Jul 10, 2025
* Time	 : 2:33:48 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

/**
 * Program to demonstrate Method Overloading. - Static Polymorphism
 * @param s1
 * @param s2
*
* Overload add() method with different type/no. of Arguments
*/

class IAddition {
	
		public void add(){
	        System.out.println("Method OverLoading demo");
	    }
	    public void add(int a,int b){
	        System.out.println("The Addition of 2 Nos is : "+(a+b));
	    }
	    public void add(double a,double b){
	        System.out.println("The Addition of 2  float Nos is : "+(a+b));
	    }
	    public void add(int a,int b,int c){
	        System.out.println("The Addition of3 Nos is : "+(a+b+c));
	    }
	    public void add(String s1,String s2){
	        System.out.println("The Addition of 2 Strings is : "+(s1+s2));
	    }
}


public class OverloadDemo{
	
	public static void main(String[] args) {
		
		IAddition a1 = new IAddition();
		
		a1.add();
		a1.add(20, 30);
		a1.add(36.55f, 530.50f); //type promotion from float to double 
		a1.add(100,300,600);
		a1.add("Java ","Programming");
	}
	
	
}
