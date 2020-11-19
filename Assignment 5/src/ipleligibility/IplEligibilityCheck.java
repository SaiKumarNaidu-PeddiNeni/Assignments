package ipleligibility;

import java.util.Scanner;

/*Write a program to get the name and age of the player from the user and display it.
player name is a string
player age is an integer value
Note : The player is eligible to participate in IPL when their age is 19 and above
This program may generate
1. InvalidAgeRange Custom Exception when the player's age is below 19
Use exception handling mechanisms to handle these exceptions
Create a class called CustomException which extends Exception and it includes constructor to initialize the message.
Use appropriate exception handling mechanisms to handle these exceptions
*/

import userexception.MyException;

public class IplEligibilityCheck {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter player name");
		String name = scan.nextLine();
		System.out.println("enter player age");
		int age = scan.nextInt();

		try {
			if (age >19) {
				System.out.println("player name " + name);
				System.out.println("age "+ age);
			} 
			else {
				throw new MyException("InvalidAgeRangeException");
			}
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		scan.close();
	}

}
