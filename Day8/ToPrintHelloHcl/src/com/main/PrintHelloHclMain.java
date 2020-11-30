/*Write a Java program by using BufferedReader class to prompt a user to input his/her name and then the output will be shown as an example below:
Hello HCL!
*/
/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintHelloHclMain {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name :");
		String name = bufferedReader.readLine();

		System.out.println("Hello " + name);
		bufferedReader.close();

	}

}
