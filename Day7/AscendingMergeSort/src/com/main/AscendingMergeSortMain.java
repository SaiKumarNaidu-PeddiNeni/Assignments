/*Write a code to read two int array lists of size 5 each as input and to merge the two arrayLists, sort the merged arraylist in ascending order and fetch the elements at 2nd, 6th and 8th index into a new arrayList and return the final ArrayList.
Include a class UserMainCode with a static method sortMergedArrayList which accepts 2 ArrayLists.
The return type is an ArrayList with elements from 2,6 and 8th index position .Array index starts from position 0.
Create a Main class which gets two array list of size 5 as input and call the static method sortMergedArrayList present in the UserMainCode.
*/

/**
 * @author Pushpa Kumar Reddy
 */

package com.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.pojo.AscendingMergeSort;

public class AscendingMergeSortMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int size1;
		System.out.println("Enter the size of first array :");
		size1 = scanner.nextInt();

		ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist3 = new ArrayList<Integer>();
		System.out.println("Enter first array :");
		for (int i = 0; i < size1; i++)
			arraylist1.add(scanner.nextInt());
		int size2;
		System.out.println("Enter the size second of array :");
		size2 = scanner.nextInt();
		System.out.println("Enter second array :");
		for (int j = 0; j < size2; j++)
			arraylist2.add(scanner.nextInt());
		arraylist3 = AscendingMergeSort.sortMergedArrayList(arraylist1, arraylist2);
		System.out.println("The elements at index 2 6 8 are : ");
		for (int k = 0; k < 3; k++)
			System.out.println(arraylist3.get(k));
		scanner.close();
	}
}
