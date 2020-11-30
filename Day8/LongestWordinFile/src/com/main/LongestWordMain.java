/*Write a Java program to find the longest word in a text file.*/
/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.io.FileNotFoundException;
import com.pojo.LongestWord;

public class LongestWordMain {

	public static void main(String[] args) throws FileNotFoundException {
		LongestWord longest = new LongestWord();
		String word1 = longest.findLongestWords();
		System.out.println("The longest word in file is : \n" + word1);

	}

}
