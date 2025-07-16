package oopsdemo4;

/**
* Author : Tushar.Kumawat
* Date   : Jul 11, 2025
* Time	 : 3:18:11 PM
* Email	 : Tushar.Kumawat@coforge.com
*/

//Implement Multiple Inheritance
class Result extends Candidate implements IExam
{

	public Result(String name, int roll_no, int mark1, int mark2) {
		super(name, roll_no, mark1, mark2);
		System.out.println("*********** Candidate Result **************");
	}

	@Override
	public void percent_cal() {
		int total=(mark1+mark2);
		float percent=total*100/200;
		System.out.println ("Percentage: "+percent+"%");
	}

}


public class MultipleDemo {

	public static void main(String[] args) {
	
		Result result = new Result("John", 101, 92, 85);
		
		result.display();
		result.percent_cal();
		
	}

}
