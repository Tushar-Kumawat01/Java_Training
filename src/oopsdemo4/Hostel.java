package oopsdemo4;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 4:04:21 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Hostel {
	
	String name,location;

	//generate constructors using fields
	public Hostel(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	//generate getters
	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

}
