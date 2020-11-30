/*Write a Java program to append text to an existing file*/

/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendTextMain {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter text add to a file ");
		String string = scanner.nextLine();

		System.out.println("Text before added to a file");
		int data1;
		BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\HCL\\Mode1Training\\Java\\Day8\\FileReadandWrite.txt"));
		while ((data1 = bufferedReader.read()) != -1) {
			System.out.print((char) data1);
		}
		bufferedReader.close();

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\\\HCL\\\\Mode1Training\\\\Java\\\\Day8\\\\FileReadandWrite.txt", true));
		bufferedWriter.write(" " + string);
		bufferedWriter.close();

		System.out.println();
		System.out.println("Text after added to a file");
		int data2;
		BufferedReader bufferedReader2 = new BufferedReader(new FileReader("D:\\\\HCL\\\\Mode1Training\\\\Java\\\\Day8\\\\FileReadandWrite.txt"));
		//System.out.println("Text after added to a file");
		while ((data2 = bufferedReader2.read()) != -1) {
			
			System.out.print((char) data2);
		}

		bufferedReader2.close();

		string = null;
		scanner.close();

	}

}
