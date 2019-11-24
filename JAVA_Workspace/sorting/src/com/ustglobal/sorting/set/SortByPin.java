package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByPin implements Comparator<Bank>{

	@Override
	public int compare(Bank b1, Bank b2) {
		Integer i = b1.pincode;
		Integer j = b2.pincode;
		return i.compareTo(j);
	}
}
