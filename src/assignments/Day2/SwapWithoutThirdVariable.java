package assignments.Day2;


public class SwapWithoutThirdVariable {
 public static void main(String[] args) {
     int num1 = 10;
     int num2 = 20;

     System.out.println("Before swap: num1 = " + num1 + ", num2 = " + num2);

     num1 = num1 + num2;
     num2 = num1 - num2;
     num1 = num1 - num2;

     System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);
 }
}
