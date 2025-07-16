package oopsdemo2;

/**
* Author : Tushar.Kumawat
* Date   : Jul 10, 2025
* Time	 : 12:29:55 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

class Honda extends Car{
	
	public void hondaStart()
	{
		Engine heng = new Engine(); //Composition - Honda class full dependent on Engine
		heng.startEngine();
	}
}

class Hyundai extends Car{
	
	public void hyundaiStart()
	{
		Engine heng = new Engine();	 //Composition - Hyundai class full dependent on Engine
		heng.startEngine();
	}
}

public class CompositionDemo {

	public static void main(String[] args) {
		
		Honda hondaCity =new Honda();
		
		hondaCity.setColor("Silver"); //car class methods
		hondaCity.setMax_speed(180);	//car class methods
		
		System.out.println("*******Honda Car Details *********");
		String color = hondaCity.getColor();
		System.out.println(color +" Color");//car class methods
		int max_speed = hondaCity.getMax_speed();
		System.out.println(max_speed+" Speed");//car class methods
		
		hondaCity.hondaStart(); // honda class method-- > call ENgine class method
		
//		hondaCity=null;
//		System.gc();
		System.out.println(hondaCity.getColor());
		
		
		
		Hyundai h =new Hyundai();
		
		hondaCity.setColor("Silver");
		hondaCity.setMax_speed(180);	
		
		System.out.println("*******Hyundai Car Details *********");
		System.out.println(hondaCity.getColor() +" Color");
		System.out.println(hondaCity.getMax_speed()+" Speed");
		
		hondaCity.hondaStart();
		

	}

}
