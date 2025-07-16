package oopsdemo1;

import java.util.Objects;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 11:34:47 AM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Trainee {

	private int id;
	private String name,tech;
	private double stipend;
	
	
	public Trainee() {
		System.out.println("Implicit Constructor");
		
		this.id=111;
		this.name="James Gosling";
		this.tech="Java";
		this.stipend=5000;
	}


	public Trainee(int id, String name, String tech, double stipend) {
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}
	
    void display()
	{
		System.out.println("********** Trainee Details ***************");
		System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
		System.out.println("------------------------------------------");
	}

    //source code>generate hash code and equals>select all
    //we can check two object by overriding the hasCode and equals methods 
    //in the instance class
	@Override
	public int hashCode() {
		return Objects.hash(id, name, stipend, tech);
	}

	//checks all the properties of the two object that they are equal or not
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(stipend) == Double.doubleToLongBits(other.stipend)
				&& Objects.equals(tech, other.tech);
	}

}
