/**
 * 
 */
package findSmall;

import java.util.Scanner;

public class SmallNumber {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number1=scan.nextInt();
		int number2=scan.nextInt();
		int number3=scan.nextInt();
		
		System.out.println(FindSmall.findSmall(number1,number2,number3));
		
		scan.close();

	}

}
