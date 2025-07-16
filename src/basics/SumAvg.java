package basics;

import java.util.Scanner;
/**
 * Author : Tushar.Kumawat
 * Date   : Jul 14, 2025
 * Time	 : 9:59:27 AM
 * Email	 : Tushar.Kumawat@coforge.com
 */




public class SumAvg {

	public static void main(String[]args) {

		int num1,num2,num3;
		String ad;

		Scanner scanner=new Scanner(System.in);

		System.out.println("enter name");
		ad=scanner.next();

		System.out.println("enter 3 no");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();

		int sum=num1+num2+num3;
		float avg=(float)sum/3;

		System.out.println(avg);
		System.out.format("%.2f",avg);

		scanner.close();

	}
}





