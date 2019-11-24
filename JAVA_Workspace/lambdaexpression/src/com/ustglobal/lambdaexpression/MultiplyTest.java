package com.ustglobal.lambdaexpression;

public class MultiplyTest {

	public static void main(String[] args) {
		
		MultiplyInterface mul = (a,b) -> a*b;
		int product = mul.multiply(20, 10);
		System.out.println("Product of numbers = " +product);
	
	}
}
