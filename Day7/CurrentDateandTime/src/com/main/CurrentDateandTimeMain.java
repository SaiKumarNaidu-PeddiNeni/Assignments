/*Write a java program to print current date and time in the specified format.
 * 
 */

/**
 * @author Pushpa Kumar Reddy
 */



package com.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateandTimeMain {

	public static void main(String[] args) {
		DateFormat dateformat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println("The current date and time is :\n");
		System.out.println(dateformat.format(dateobj));
	}

}
