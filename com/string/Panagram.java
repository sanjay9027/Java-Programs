package com.string;

import java.util.Scanner;

public class Panagram extends RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();

		// remove spaces
		String res = removeSpace(str);

		if (panagram(res) == 26) {
			System.out.println(" String is Panagram");
		} else {
			System.out.println("String is Not Panagram");
		}

		sc.close();

	}

	static int panagram(String res) {
		// convert to lowercase
		String res1 = res.toLowerCase();
		char ch[] = res1.toCharArray();
		// logic
		int count = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			for (char val : ch) {
				if (i == val) {
					count = count + 1;
					break;
				}
			}
		}
		System.out.println(count);
		return count;
	}
}
