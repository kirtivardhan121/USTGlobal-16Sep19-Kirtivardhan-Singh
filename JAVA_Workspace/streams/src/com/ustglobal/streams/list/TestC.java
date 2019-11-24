package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(20);
		al.add(23);
		al.add(5);
		al.add(1);
		al.add(12);
		al.add(4);

		List<Integer> l = al.stream().map(i -> i*3 ).collect(Collectors.toList());

		for(Integer i : l) {
			System.out.println(i);
		}


	}
}
