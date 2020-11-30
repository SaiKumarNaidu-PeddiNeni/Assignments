package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

import com.pojo.ComparePrintOldDate;


public class ComparePrintOldDateMain {

	public static void main(String[] args) throws ParseException, IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date :");
		String date1 = br.readLine();
		System.out.println("Enter second date :");
		String date2 = br.readLine();
		System.out.println("The Old date is : "+ComparePrintOldDate.findOldDate(date1,date2));

				
		 

	}
}


