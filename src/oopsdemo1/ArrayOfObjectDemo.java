package oopsdemo1;

/**
* Author : Tushar.Kumawat
* Date   : Jul 8, 2025
* Time	 : 4:07:24 PM
* Email	 : Tushar.Kumawat@coforge.com
*/


class Employee1 {
	int empId;
    String name;
    
    public void setData(int c,String d){
        this.empId=c;
       this.name=d;
     }
    
    public void showData(){
        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
        System.out.println();
     }
}

public class ArrayOfObjectDemo {

	public static void main(String[] args) {
		// create array of Employee Object
		Employee1[] obj=new Employee1[5];
		
		// create actual Employee Object
		for(int i=0;i<5;i++)
		{
			obj[i]=new Employee1();
		}
		
		// assign data to employee Objects
		obj[0].setData(100,"James");
		obj[1].setData(101,"Gavin");
		obj[2].setData(102,"Navin");
		obj[3].setData(103,"Mary");
		obj[4].setData(104,"Rod");
		
		// display employ Object data
		System.out.println("*********** Employee Details ***********");
		for(int i=0;i<5;i++)
		{
			obj[i].showData();
		}
		System.out.println("****************************************");
}
	}

