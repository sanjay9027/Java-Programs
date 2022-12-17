package com.programs;

import java.util.Scanner;

//WAP to Display Even and Odd
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd Number");
		}
		sc.close();
	}

}
