package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>();
		ts.add("roopa");
		ts.add("Jaya");
		ts.add("Susha");
		ts.add("Munni");
//		ts.add(null);

		System.out.println("********** Using for each ***********");

		for(String s : ts) {
			System.out.println(s);
		}

		System.out.println("********** Using Iterator ***********");

		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			String p = it.next();
			System.out.println(p);
		}
	}
}
