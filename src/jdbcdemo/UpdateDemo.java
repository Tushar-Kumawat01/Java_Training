package jdbcdemo;

/**
* Author : Tushar.Kumawat
* Date   : Jul 15, 2025
* Time	 : 3:04:00 PM
* Email	 : Tushar.Kumawat@coforge.com
*/



public class UpdateDemo {

	public static void main(String[] args) {
	
		Candidates c1 = new Candidates();
		
		try
		{
			c1.getConnection();
			c1.UpdateCandidate();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
