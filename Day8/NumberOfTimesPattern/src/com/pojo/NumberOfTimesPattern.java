package com.pojo;

public class NumberOfTimesPattern {
	public static int subStringCount(String string, String givenString) {

		int k;
		int count = 0;
		int length = string.length();
		int length1 = givenString.length();
		for (int i = 0; i <= length1 - length; i++) {
			for (k = 0; k < length; k++) {
				if (givenString.charAt(i + k) != string.charAt(k)) {
					break;
				}
			}
			if (k == length)
				count++;
		}
		return count;
	}

}
