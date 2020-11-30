package com.pojo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirst3Lines {

	public String readLines() throws IOException {
		String line = null;
		System.out.println("The first three lines of file are :");
		try (BufferedReader bufferedReader = new BufferedReader(
				new FileReader("D:\\\\HCL\\\\Mode1Training\\\\Java\\\\Day8\\\\FileReadandWrite.txt"))) {
			for (int i = 0; i < 3; i++) {
				line = bufferedReader.readLine();
				System.out.println(line);
			}

		}
		return null;
	}

}
