package oopsdemo1;

/**
* Author : Tushar.Kumawat
* Date   : Jul 8, 2025
* Time	 : 2:52:13 PM
* Email	 : Tushar.Kumawat@coforge.com
*/
class Lamp
{
	//stores the value for light , is it on or off.
	boolean isOn;
	
	//method to turn on the light
	void turnOn()
	{
		isOn = true;
		System.out.println("Light On? "+isOn);
	}
	
	//method to turn off the light
	void turnOff()
	{
		isOn = false;
		System.out.println("Light On? "+isOn);
	}
}


public class LampTest {

	public static void main(String[] args) {
		
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		
		//switch on
		led.turnOn();
		halogen.turnOn();
		
		//switch off
		led.turnOff();
		halogen.turnOff();

	}

}
