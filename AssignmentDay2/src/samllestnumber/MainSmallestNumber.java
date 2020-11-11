package samllestnumber;

import java.util.Scanner;

public class MainSmallestNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		SmallestNumber smallestNumber = new SmallestNumber();

		System.out.println("Enter dimensions");

		//smallestNumber.setDimensions(scanner.nextInt());
		
		int size = scanner.nextInt();
		
		smallestNumber.array(size);

		System.out.println("Enter elements");
		// System.out.println(smallestNumber.getDimensions());

		for (int i = 0; i < size; i++) {

			smallestNumber.setNumber(scanner.nextInt(), i);
		}

		System.out.println(smallestNumber.smallNumberFinding());

		smallestNumber = null;
		scanner.close();
	}
}
