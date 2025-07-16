package java8features;

/**
* Author : Tushar.Kumawat
* Date   : Jul 16, 2025
* Time	 : 11:44:00 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Car implements IVehicle{

	private String brand;

	public Car(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String speedUp() {
		return "Car is Speeding Up !!!!";
	}

	@Override
	public String slowDown() {
		return "Car is Slowing down !!!";
	}
	
}
