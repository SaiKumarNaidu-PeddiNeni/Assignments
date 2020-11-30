/*Get two date strings as input and write code to find difference between two dates in days.
Include a class UserMainCode with a static method getDateDifference which accepts two date strings as input.
The return type of the output is an integer which returns the diffenece between two dates in days.

*/

/**
 *@author Pushpa Kumar Reddy
 */

package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

import com.pojo.DifferenceBetweenDates;

public class DifferenceBetweenDatesMain {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date :");
		String date1 = br.readLine();
		System.out.println("Enter second date :");
		String date2 = br.readLine();
		DifferenceBetweenDates difference = new DifferenceBetweenDates();

		System.out.println("The Difference between dates is " + DifferenceBetweenDates.getDateDifference(date1, date2));
	}

}
