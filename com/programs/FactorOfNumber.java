package com.programs;



public class FactorOfNumber {
	public static void main(String[] args) {
		//number
		int num=60;
		
		//logic
		System.out.println("Factors are ");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
