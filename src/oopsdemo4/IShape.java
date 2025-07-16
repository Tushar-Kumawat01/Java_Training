package oopsdemo4;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 2:54:58 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public interface IShape {
	
	//implicitly public,static and final
	public String LABLE="Shape";
	
	//interface methods are implicitly abstract and public
	void draw();
	
	public abstract double getArea();

}
