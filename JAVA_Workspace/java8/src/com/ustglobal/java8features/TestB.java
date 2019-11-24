package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {

	public static void main(String[] args) {
		
		Predicate<Student> p = s -> {
			if(s.percentage >= 35 ) {
				return true;
			}else {
				return false;
			}
		};
		
		
		Student s = new Student(1, "Anup", 80.9);
		
		boolean res = p.test(s);
		System.out.println("Result is " +res);
	}
}
