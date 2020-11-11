package elementsearch;

import java.util.Scanner;

public class MainElements {

	public static void main(String[] args) {

		int size = 0;
		int element = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("enter size");
		size = scan.nextInt();
		System.out.println("enter element to search");
		element = scan.nextInt();

		ElementSearch elementSearch = new ElementSearch();

		elementSearch.arraySize(size);

		System.out.println("enter elements" + size);

		for (int i = 0; i < size; i++) {
			elementSearch.setArray(scan.nextInt(), i);
		}

		System.out.println(elementSearch.elementSearch(element));

	}

}
