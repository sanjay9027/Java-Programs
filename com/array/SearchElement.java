package com.array;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 2, 23, 45, 67, 12, 32, 67, 122 };
		System.out.println("enter key");
		int key = sc.nextInt();
		search(key, arr);
		sc.close();
	}

	// logic
	public static void search(int key, int[] arr) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println(key + " is found at location: " + i);
				flag = true;
//				break;
			}

		}
		if (flag == false) {
			System.out.println("not found");
		}

	}
}
