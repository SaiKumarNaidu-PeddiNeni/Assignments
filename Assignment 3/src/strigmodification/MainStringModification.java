package strigmodification;

import java.util.Scanner;

public class MainStringModification {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String string;
		string = scan.nextLine();

		StringModification stringModification = new StringModification();

		System.out.println(stringModification.ModifyTheString(string));
		
		scan.close();
		stringModification = null;

	}

}
