package com.string;

import java.util.Scanner;

/* Ex. HEART <-> EARTH */
public class Anagram extends RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String str1 = sc.nextLine();
		System.out.println("Enter 2nd String");
		String str2 = sc.nextLine();
		String s1 = removeSpace(str1);
		String s2 = removeSpace(str2);

		if (anagram(s1, s2)) {
			System.out.println("Two Strings are Anagram");
		} else {
			System.out.println("Two Strings are Not Anagram");
		}

		sc.close();

	}

	public static boolean anagram(String s1, String s2) {

		if (s1.length() == s2.length()) {
			char[] result1 = sortArray(s1);
			char[] result2 = sortArray(s2);

			for (int l = 0; l < result1.length; l++) {
				if (result1[l] != result2[l]) {
					return false;
				}

			}
			return true;

		}
		return false;

	}

	// logic to sort array elements
	static char[] sortArray(String str) {
		// to lower_case String
		str = str.toLowerCase();
		char[] arr = str.toCharArray();
		char temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
