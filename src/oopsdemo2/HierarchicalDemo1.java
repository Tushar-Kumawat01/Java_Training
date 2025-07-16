package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 10, 2025
* Time	 : 9:47:13 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class HierarchicalDemo1 {

	public static void main(String[] args) {
	  
	  Specialist spObj=new Specialist(1001,"Mary King","NewYork","Cardiologist");
	  spObj.display();
	  
      NonSpecialist nspObj=new NonSpecialist(2001,"Navin Kumar","Mumbai");
	  nspObj.display();
	}

}
