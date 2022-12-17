package com.programs;

import java.util.Scanner;
//WAP to check a Number is Prime
public class PrimeOrNot {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
//		typecast double to int
		double num1 =  sc.nextDouble();
		int num= (int) num1;
		
		
		int counter = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				counter++;
			}
		}
		if (counter == 2) {
			System.out.println(num1+" is Prime Number");
		} else {
			System.out.println(num1+" is not Prime Number");
		}

		sc.close();
	}
}
