package com.pojo;

public class DaysInAMonth {
	public static int display(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		else if ((month == 2) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
			return 29;
		} else if (month == 2) {
			return 28;
		} else
			return 30;
	}
}
