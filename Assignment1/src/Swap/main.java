package Swap;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the two numbers");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();

		System.out.println("Before swap: number1 = " + number1 + " number2 = " + number2);

		Swap swap = new Swap(number1, number2);

		swap.swapping();

		scan.close();
		swap = null;

	}

}
