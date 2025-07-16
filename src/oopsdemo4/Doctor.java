package oopsdemo4;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 12:43:43 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

//Concrete subclass for Doctors
public class Doctor extends HospitalStaff{

	private String specialization;

	public Doctor(String name, String id, String department, String specialization) {
		super(name, id, department);
		this.specialization = specialization;
	}

	@Override
	public void performDuties() {
		System.out.println(getName() + " is examining patients in the " + 
                getDepartment() + " department (" + specialization + ").");
		
	}
	
	 public void prescribeMedication() {
	        System.out.println(getName() + " is writing a prescription.");
	    }

}
