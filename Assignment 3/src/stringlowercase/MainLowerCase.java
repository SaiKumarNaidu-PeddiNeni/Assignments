package stringlowercase;

import java.util.Scanner;

public class MainLowerCase {

	public static void main(String[] args) {
		String string;
		Scanner scan = new Scanner(System.in);
		
		StringLowerCase stringLowerCase = new StringLowerCase();
		
		string = scan.nextLine();
		
		System.out.println(stringLowerCase.lowerCase(string));
		
		scan.close();
		stringLowerCase = null;
		

	}

}
