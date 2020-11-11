/**
 * 
 */
package interfaceexample;

import java.util.Scanner;

/**
 * @Sai Kumar Nov 9, 2020
 * 
 */
public class MainInterface {

	/**
	 * program to find the sum of divisors
	 */
	public static void main(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		number = scan.nextInt();

		MyCalculator myCalculator = new MyCalculator();
		System.out.println("sum of all divisors of " + number +" is "+myCalculator.divisor_sum(number));
		scan.close();
	}

}
