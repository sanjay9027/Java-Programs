package com.programs;

import java.util.Scanner;

//WAP to display MULTIPLICATION TABLES
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range of table wanted");
		int num = sc.nextInt();
		for (int i = 1; i <=num; i++) {
			System.out.println("Table for " + i);

			for (int j = 1; j <= 10; j++) {

				System.out.print(i * j+" ");

			}
			System.out.println(" ");
		}

		sc.close();

	}
}
