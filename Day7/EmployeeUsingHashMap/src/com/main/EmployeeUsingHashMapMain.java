/*A Company wants to obtain employees of a particular designation. You have been assigned as the programmer to build this package. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
Read Employee details from the User. The details would include name and designaton in the given order. The datatype for name and designation is string.
Build a hashmap which contains the name as key and designation as value.
You decide to write a function obtainDesignation which takes the hashmap and designation as input and returns a string array of employee names who belong to that designation as output. Include this function in class UserMainCode
*/

/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

import com.pojo.EmployeeUsingHashMap;

public class EmployeeUsingHashMapMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Employees :");
		int number = Integer.parseInt(scanner.nextLine());
		LinkedHashMap<String, String> hashmap = new LinkedHashMap<String, String>();
		System.out.println("Enter employee details :");
		for (int i = 0; i < number; i++) {
			String name = scanner.nextLine();
			String designation = scanner.nextLine();
			hashmap.put(name, designation);
		}
		System.out.println("Enter the Designation to search :");
		String word = scanner.nextLine();
		LinkedHashMap<String, String> hashmap1 = new LinkedHashMap<String, String>();
		hashmap1 = EmployeeUsingHashMap.obtainDesignation(hashmap, word);
		Iterator<String> iterator = hashmap1.keySet().iterator();

		while (iterator.hasNext()) {
			String s2 = iterator.next();
			System.out.println("The employee with the given designation is :" + s2);
			scanner.close();
		}
	}

}
