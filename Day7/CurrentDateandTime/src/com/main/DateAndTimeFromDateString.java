//Write a Java program to extract date, time from the date string
/**
 * @author Pushpa Kumar Reddy
 */


package com.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeFromDateString {

	public static void main(String[] args) {
		String dateTime = "2020-11-13 10:23:02";

		try {

			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateTime);
			String newstr = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss").format(date);
			System.out.println("\n" + newstr + "\n");
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
