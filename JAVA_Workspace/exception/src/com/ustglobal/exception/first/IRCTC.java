package com.ustglobal.exception.first;

public class IRCTC {

	public void confirm() {
		System.out.println("IRCTC Starteed");

		try {
			System.out.println(10/0);
			
		}catch(ArithmeticException ae) {
			System.out.println("Site is Busy");
		}
		
		System.out.println("IRCTC Ended");
	}
}
