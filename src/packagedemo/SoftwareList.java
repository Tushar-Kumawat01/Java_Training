package packagedemo;

import com.coforge.training.microsoft.OperatingSystem;
import com.coforge.training.oracle.Database;

/**
* Author : Tushar.Kumawat
* Date   : Jul 12, 2025
* Time	 : 2:49:56 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

//java.lang package is by default imported in java Programs
//Classes in lang package : System, String, Object
/**
* Program to demonstrate import & usage of user-defined Packages
*/
public class SoftwareList {

	public static void main(String[] args) {
		
		OperatingSystem op1 = new OperatingSystem();
		Database db1 = new Database();
		
		System.out.println("************* List of Operating System from Microsoft **************");
		op1.listSoftware(); //Invoke method from other user defined package
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("************* List of Databases from Oracle ************************");
		db1.printSoftware();
	}
	
}
