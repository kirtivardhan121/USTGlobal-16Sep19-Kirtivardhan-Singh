package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {
		

		TreeMap<String, Integer> lh = new TreeMap<>();
		lh.put("Bangalore", 560068);
		lh.put("Pune", 451076);
		lh.put("Mumbai", 467844);
		
		System.out.println(lh);
		
		System.out.println("=============================");
		
		for(Map.Entry<String , Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is " +key+ " Value is " +value);
			System.out.println("=============================");
		}
	}
}
