package com.main;

import java.util.Scanner;

import com.pojo.DaysInAMonth;

public class DaysInAMonthMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year :");
		int year = scanner.nextInt();
		System.out.println("Enter month :");
		int month = scanner.nextInt();
		DaysInAMonth daysinmonth = new DaysInAMonth();
		System.out.println("The days in month are :" + daysinmonth.display(year, month));
		scanner.close();

	}

}
