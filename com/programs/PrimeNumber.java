package com.programs;

import java.util.Scanner;

//WAP to display all Prime Number from 1 to N and pprint their sum
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < num; i++) {
			boolean flag = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("");
		System.out.println("Sum of all Prime Numbers: " + sum);
		sc.close();
	}
}
