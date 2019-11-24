package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {

	public static void main(String[] args) {
		
		SortByPin sp = new SortByPin();
		SortByName sb = new SortByName();
		SortByMicr sm = new SortByMicr();
		TreeSet<Bank> ts = new TreeSet<Bank>(sb);
		
		
		Bank b1 = new Bank("HDFC", 560098, 678898668);
		Bank b2 = new Bank("SBI", 886868, 569797000);
		Bank b3 = new Bank("CITI", 7564658, 68555467);
		Bank b4 = new Bank("CANARA", 1862569, 754565);
		Bank b5 = new Bank("CANARA", 1862569, 754565);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		System.out.println("************ Using iterator ***********");
		
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Bank name " +b.name);
			System.out.println("Pincode " +b.pincode);
			System.out.println("MICR is " +b.micr);
			
			System.out.println("====================================");
			
		}

	}
}
