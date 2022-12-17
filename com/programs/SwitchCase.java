package com.programs;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number in range 1 to 3");
		int num = sc.nextInt();
		switch (num) {
		case 1: {
			System.out.println("MON");
			break;
		}
		case 2: {
			System.out.println("TUE");
			break;
		}
		case 3: {
			System.out.println("WED");
			break;
		}
		default:
			System.out.println("Unexpected value: " + num);
					
		}
		sc.close();
		
	}
}
