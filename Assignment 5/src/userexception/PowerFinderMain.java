package userexception;

import java.util.Scanner;

public class PowerFinderMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter two numbers");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();

		try {
			if (number1 > 0 && number2 > 0) {
				System.out.println("power is " + Math.pow(number1, number2));
			} else if (number1 < 0 | number2 < 0) {
				throw new MyException("Power can't be findable for negative numbers");
			} else {
				throw new MyException("Power can't be findable for Zeros");
			}
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		scan.close();
	}

}
