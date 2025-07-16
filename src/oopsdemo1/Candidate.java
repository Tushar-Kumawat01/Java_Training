package oopsdemo1;

/**
* Author : Tushar.Kumawat
* Date   : Jul 9, 2025
* Time	 : 12:38:47 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class Candidate {
	
	private int id;
	private String name;
	private float stipend,da;
	
	public Candidate(int id, String name, float stipend) {
		this.id = id;
		this.name = name;
		this.stipend = stipend;
	}
	
	public void calculateDA()
	{
		this.da=this.stipend*.10f;
	}
		
	void display()
	{
		System.out.println("************* Candidate Details ***************");
		System.out.println("Candidate Id              :"+id);
		System.out.println("Candidate Name            :"+name);
		System.out.println("Candidate Stipend         :"+stipend);
		System.out.println("Candidate Daily Allowance :"+da);
	}
}
