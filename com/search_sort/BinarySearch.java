package com.search_sort;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 2, 7, 12, 4, 5, 7, 9, 19, 20 };
		Arrays.sort(arr);
		int key = 2;
		boolean flag = search(arr, key);
		if (flag == true) {
			System.out.println(key + " is found");
		} else {
			System.out.println(key + " is NOT found");

		}

	}

	static boolean search(int[] arr, int key) {

		int len = arr.length;
		int l = 0, h = len-1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (key == arr[m]) {
				return true;
			} else if (key > arr[m]) {
				l = m + 1;
			} else if (key < arr[m]) {
				h = m - 1;
			}
		}
		return false;
	}

}
