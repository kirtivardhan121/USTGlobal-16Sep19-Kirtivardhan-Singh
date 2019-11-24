package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestL {

	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		
		al.add(34.5);
		al.add(37.5);
		al.add(38.5);
		al.add(24.5);
		al.add(14.5);
		al.add(null);
		al.add(null);
		al.add(34.5);
		
		System.out.println(al);
		
		System.out.println("--------ArrayList Methods--------------");
		
		al.add(2, 54.6);
		System.out.println("After 2nd Index " +al);
		
		System.out.println("----------------------");
		
		al.remove(0);
		System.out.println("After removing 0th Index " +al);
		
		System.out.println("----------------------");
		
		al.remove(null);
		System.out.println("After removing null " +al);
		
		System.out.println("----------------------");
		
		Double val = al.get(4);
		System.out.println("Object at 4th Index " +val);
		
		System.out.println("----------------------");
		
		al.set(2, 77.6);
		System.out.println("After replcing 2nd index " +al);
		
		System.out.println("----------------------");
		
		al.clear();
		System.out.println("After clear Method " +al);
		
		System.out.println("----------------------");
		
		al.contains(54.6);
		
		System.out.println("-------- List Methods--------------");
		
		List<Double> al1 = new ArrayList<>();
		
		al1.add(34.45);
		al1.add(98.09);
		al1.add(val);
		
		al1.addAll(al1);
		System.out.println("After Add All " +al1);
		
		boolean contain = al.containsAll(al1);
		System.out.println("Contains All " +contain);
		
		boolean res = al.removeAll(al1);
		System.out.println("Remove all of al1 " +res);
				
		
		
	
	
	
	
	}
}
