package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// add elements to array
		System.out.println("Enter array length");
		int l = sc.nextInt();
		int[] a = new int[l];
		System.out.println("enter array elements");
		for (int v = 0; v < l; v++) {
			a[v] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		// reverse array elements
		int len = a.length;
		int[] arr = new int[len];
		// reverse
		for (int i = 0; i < len; i++) {
			arr[i] = a[len - 1 - i];
		}
		System.out.println(Arrays.toString(arr));

		sc.close();
	}
}
