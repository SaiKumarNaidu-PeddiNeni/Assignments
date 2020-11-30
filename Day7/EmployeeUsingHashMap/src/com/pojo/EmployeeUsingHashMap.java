package com.pojo;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class EmployeeUsingHashMap {
	public static LinkedHashMap<String, String> obtainDesignation(LinkedHashMap<String, String> h1, String word) {
		LinkedHashMap<String, String> hashmap1 = new LinkedHashMap<String, String>();
		Iterator<String> iterator = h1.keySet().iterator();
		while (iterator.hasNext()) {
			String s2 = iterator.next();
			String s3 = h1.get(s2);
			if (s3.equals(word))
				hashmap1.put(s2, s3);
		}
		return hashmap1;
	}

}
