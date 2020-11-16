package evennumbersquaresum;

import java.util.Scanner;

public class EvenNumberSquareSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		int result = 0;
		while (number > 0) {
			int value = number % 10;
			if (value % 2 == 0) {
				result = result + value * value;
			}
			number = number / 10;
		}
		System.out.println(result);
		scan.close();
	}

}
