package lowercaseconversion;

import java.util.Scanner;

public class LowercaseConversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		
		string = string.toLowerCase();
		System.out.println("string");
		
		scan.close();

	}

}
