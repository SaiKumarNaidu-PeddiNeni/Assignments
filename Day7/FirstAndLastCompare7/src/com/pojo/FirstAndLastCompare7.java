package com.pojo;

public class FirstAndLastCompare7 {
	public static int checkCharacters(String word) {
		int n = word.length();
		if (n < 2)
			return -1;
		if (word.charAt(0) == word.charAt(n - 1))
			return 1;
		else
			return 0;

	}

}
