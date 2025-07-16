package exceptionsdemo;

/**
 * Author : Tushar.Kumawat
 * Date   : Jul 12, 2025
 * Time	 : 10:44:42 AM
 * Email	 : Tushar.Kumawat@coforge.com
 */

//General Exception Handling

public class ExceptionDemo {

	public static void main(String[] args) {

		String languages[] = { "C", "C++", "Java", "Perl", "Python" };

		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(languages[i]);
			}
		}
		catch(Exception ex)
		{
			System.err.println(ex); //use err instead of out
		}

	}

}
