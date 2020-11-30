/*Write a program to read a string and to test whether first and last character are same. The string is said to be be valid if the 1st and last character are the same. Else the string is said to be invalid.
Include a class UserMainCode with a static method checkCharacters which accepts a string as input .
The return type of this method is an int. Output should be 1 if the first character and last character are same . If they are different then return -1 as output.
Create a class Main which would get the input as a string and call the static method checkCharacters present in the UserMainCode.
Sample Input :
the picture was great
Sample Output : Valid
*/

/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.util.Scanner;

import com.pojo.FirstAndLastCompare7;

public class FirstAndLastCompare7Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word;
		System.out.println("Enter the word :");
		word = scanner.nextLine();
		FirstAndLastCompare7 compare = new FirstAndLastCompare7();
		int result = compare.checkCharacters(word);
		if (result == -1)
			System.out.println("Invalid Input");
		else if (result == 1)
			System.out.println("The Given Word is Equal");
		else
			System.out.println("The Given Word is Not Equal");
		scanner.close();
		word = null;
	}

}
