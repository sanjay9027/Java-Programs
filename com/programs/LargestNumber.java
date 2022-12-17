package com.programs;

public class LargestNumber {

	public static void main(String[] args) {
		int a=10, b=89, c=780;
		
		//using ternary operator
		
		int largest=a>b?a:b;
		largest=largest>c?largest:c;
		System.out.println(largest);
		
		//using if else
		
		if(a>b &&a>c) {
			System.out.println(a);
		}
		else if(b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}
}
