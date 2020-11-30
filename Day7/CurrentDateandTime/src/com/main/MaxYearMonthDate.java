//Write a Java program to get the maximum value of the year, month, week, date from the current date of a default calendar

/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.util.Calendar;

public class MaxYearMonthDate {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("\nCurrent Date and Time:" + calendar.getTime());

		int maxYear = calendar.getActualMaximum(Calendar.YEAR);
		int maxMonth = calendar.getActualMaximum(Calendar.MONTH);
		int maxDate = calendar.getActualMaximum(Calendar.DATE);
		int maxHour = calendar.getActualMaximum(Calendar.HOUR);
		int maxMinute = calendar.getActualMaximum(Calendar.MINUTE);

		System.out.println("Max Year :" + maxYear);
		System.out.println("Max Month :" + maxMonth);
		System.out.println("Max Date :" + maxDate);
		System.out.println("Max Hour :" + maxHour);
		System.out.println("Max Minute :" + maxMinute);
	}

}
