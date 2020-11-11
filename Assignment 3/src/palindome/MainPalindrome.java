package palindome;

import java.util.Scanner;

public class MainPalindrome {

	public static void main(String[] args) {
		String string;
		Scanner scan = new Scanner(System.in);

		Palindrome palindrome = new Palindrome();
		string = scan.nextLine();
		System.out.println(palindrome.palindromeCheck(string));

		scan.close();
		palindrome = null;

	}

}
