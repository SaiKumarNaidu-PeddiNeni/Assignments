/*Write a java program to read the input character stream and identify patterns provided by the user. As the program output display the number of times the pattern occurred in the input character stream.
Read the character stream from the input file (team.txt) that contains the team names and display the output in the console.
Sample Input/Output :
Enter number of words
2
Enter the strings to be searched
en
perk
Given string is chennaisuperkingsvsroyalchallengersbanglore
Word:en Count:2
Word:perk Count:1
*/
/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.util.Scanner;

import com.pojo.NumberOfTimesPattern;

public class NumberOfTimesPatternMain {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of words");
		number = scanner.nextInt();

		scanner.nextLine();
		System.out.println("Enter the strings to be searched ");
		String[] string = new String[number];
		for (int i = 0; i < number; i++) {
			string[i] = scanner.nextLine();
		}

		System.out.print("Given String: ");
		String givenString = scanner.nextLine();

		for (int i = 0; i < number; i++) {

			int count = NumberOfTimesPattern.subStringCount(string[i], givenString);
			System.out.println("Word: " + string[i] + "	Count: " + count);
		}
		scanner.close();

	}

}
