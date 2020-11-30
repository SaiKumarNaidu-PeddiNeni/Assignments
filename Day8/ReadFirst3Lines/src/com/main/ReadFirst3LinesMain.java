/*Write a Java program to read first 3 lines from a file*/
/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.io.IOException;

import com.pojo.ReadFirst3Lines;

public class ReadFirst3LinesMain {

	public static void main(String[] args) throws IOException {
		ReadFirst3Lines read = new ReadFirst3Lines();
		 read.readLines();
		//System.out.println("The first three lines of file are : \n" + li);

	}

}
