package com.pojo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {
	public String findLongestWords() throws FileNotFoundException {
		String word = "";
		String current = null;
		Scanner scanner = new Scanner(new File("D:\\HCL\\Mode1Training\\Java\\Day8\\FileReadandWrite.txt"));
			while (scanner.hasNext()) {
				current = scanner.next();
				if (current.length() > word.length()) {
					word = current;
				}

		}
		return word;
	}
}
