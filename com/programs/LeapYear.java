package com.programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		// logic
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + ": is Leap year ");
		} else {
			System.out.println(year + ": is NOT Leap year !");
		}

		sc.close();
	}
}
