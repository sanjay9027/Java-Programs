package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertingElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index (0 to 6) & Value");
		int ind = sc.nextInt();
		int val = sc.nextInt();
		int[] arr = { 2, 3, 4, 5, 6, 7 };
		System.out.println("before insert ->" + Arrays.toString(arr));
		arr = insert(arr, ind, val);
		System.out.println("After insertion ->" + Arrays.toString(arr));
		sc.close();
	}

	public static int[] insert(int[] arr, int ind, int val) {
		if (ind > arr.length || ind < 0) {
			System.out.println("Invalid Index");
			return arr;
		} else {
			int[] a = new int[arr.length + 1];
			for (int i = 0; i < ind; i++) {
				a[i] = arr[i];

			}
			a[ind] = val;
			for (int j = ind + 1; j < a.length; j++) {
				a[j] = arr[j - 1];
			}
			return a;

		}

	}

}
