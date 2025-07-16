package oopsdemo4;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 4:02:13 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

public class College {

	String name;
	int id;
	String university;
	String course;
	
	//generate constructor using fields
	public College(String name, int id, String university, String course) {
		this.name = name;
		this.id = id;
		this.university = university;
		this.course = course;
	}

	//Generate getters
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getUniversity() {
		return university;
	}

	public String getCourse() {
		return course;
	}

}
