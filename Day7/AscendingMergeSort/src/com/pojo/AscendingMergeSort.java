package com.pojo;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingMergeSort {
	public static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> arraylist1, ArrayList<Integer> arraylist2) {

		arraylist1.addAll(arraylist2);
		Collections.sort(arraylist1);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(arraylist1.get(2));
		ans.add(arraylist1.get(6));
		ans.add(arraylist1.get(8));
		return ans;

	}

}
