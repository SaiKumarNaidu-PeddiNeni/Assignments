/*Write a Java program to write and read a plain text file.*/
/**
 * @author Pushpa Kumar Reddy
 */
package com.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("D:\\HCL\\Mode1Training\\Java\\Day8\\FileReadandWrite.txt");
		fileWriter.write("Welcome to Java Mode 1 Training");
		fileWriter.close();

		FileReader fileReader = new FileReader("D:\\\\HCL\\\\Mode1Training\\\\Java\\\\Day8\\\\FileReadandWrite.txt");
		try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			int data;
			while ((data = bufferedReader.read()) != -1) {
				System.out.print((char) data);
			}
		}

	}
}
