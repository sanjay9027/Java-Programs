package com.programs;

public class DigitsOfNumber {

	public static void main(String[] args) {
		int num=26534;
		int total_count = 0,even_count=0,oddcount=0;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum+=rem;
			if(rem%2==0) {
				even_count++;
			}
			else {
				oddcount++;
			}
			num=num/10;
			total_count++;
		}
		System.out.println("total digits : "+total_count);
		System.out.println("total even digits : "+even_count);
		System.out.println("total odd digits : "+oddcount);
		System.out.println("Sum of digits : "+sum);
	}
}
