package com.programs;

public class ExponantofNumber {

	public static void main(String[] args) {

		int base = 3, exponent = 4;

		//using pow()
//		double result = Math.pow(base, exponent);
		
		
		long result = 1;

		while (exponent != 0) {
			result *= base;
			--exponent;
		}

		System.out.println("Answer = " + result);
	}
}
