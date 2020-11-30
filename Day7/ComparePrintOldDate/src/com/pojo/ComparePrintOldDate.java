package com.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparePrintOldDate {
	public static String findOldDate(String date1, String date2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d1 = sdf.parse(date1);
		Date d2 = sdf.parse(date2);
		if (d1.compareTo(d2) > 0) {

			return date2;
		}

		else if (d1.compareTo(d2) < 0) {

			return date1;
		}

		else if (d1.compareTo(d2) == 0) {

			return date1;

		}
		return null;

	}

}
