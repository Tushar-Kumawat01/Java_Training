package oopsdemo1;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 12:11:03 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

/* Java program to perform addition of 2 Times
 * t1 --> 12 : 45 :55 
 * t2 --> 10 : 30 :30
 *        23    16 :25
 * 
 * t1 + t2
 *   if sec> 60 .. mins should be incremented & sec -60,,
 *   if min> 60  ... hrs should be incremented & min -60
 */
public class Time {

	private int hrs,min,sec;

	public Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
		System.out.println("The Time is : "+ this.hrs +":"+this.min+":"+this.sec);
	}
	
	public void addTime(Time obj)
	{
		//Adding seconds
		this.sec += obj.sec;
		if(this.sec >= 60 && this.sec <= 119)
		{
			this.min++;
			this.sec -= 60;
		}
		if(this.sec == 120)
		{
			this.min += 2;
			this.sec -= 120;
		}
		
		//Adding Minutes
		this.min += obj.min;
		if(this.min >= 60)
		{
			this.hrs++;
			if(this.hrs >= 24)
			{
				this.hrs -= 24;
			}
			this.min -= 60;
		}
		
		//Adding Hours
		this.hrs += obj.hrs;
		if(this.hrs >= 24)
		{
			if(this.hrs >= 24)
			{
				this.hrs -= 24;
			}
		}
	}
	
	public void display()
	{
		System.out.println("The Time after Addition is : "+ this.hrs +":"+this.min+":"+this.sec);
		System.out.println("hours : "+this.hrs +" Minute : "+this.min + " Second : "+ this.sec);
	}
}
