package com.array;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 9, 12, 15, 7, 10, 20 };
		// shouldn't contain duplicate elements
		// values should be in range
		System.out.println("length of array: " + arr.length);
		Arrays.sort(arr);
		System.out.println("Array after sorting");
		System.out.println(Arrays.toString(arr));
		misingNumber(arr);

	}

	static void misingNumber(int[] arr) {
		System.out.println("Missing elements are");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
				System.out.print(j + " ");

			}
		}
	}

}
