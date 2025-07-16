package collectionsdemo;

/**
 * Author : Tushar.Kumawat
 * Date   : Jul 14, 2025
 * Time	 : 11:45:10 AM
 * Email	 : Tushar.Kumawat@coforge.com
 */


public class GenericMethodsDemo {

	//generic method to print array of different types

	public static <E> void printArray(E[] inputArray) {

		for (E element : inputArray) { // forEach loop
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {

		// Create arrays of Integer, Double and Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		printArray(intArray);   // pass an Integer array

		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray);   // pass a Double array

		System.out.println("\nArray characterArray contains:");
		printArray(charArray);   // pass a Character array

	}

}
