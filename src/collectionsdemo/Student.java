package collectionsdemo;

/**
* Author : Tushar.Kumawat
* Date   : Jul 14, 2025
* Time	 : 4:35:52 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

//Comparable Interface is used to sort user defined objects based on single field -age
public class Student implements Comparable<Student>{

	int rollno;
	String name;
	int age;
	
	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		if(age == o.age) return 0;
		else if(age>o.age) //else if(age<o.age) //descending order
			return 1;
		else 
			return -1;
	}
}
