package com.array;

import java.util.Arrays;

public class CheckArraysEqual {

	public static void main(String[] args) {
		int a[] = { 3, 2, 5, 8 };
		int b[] = { 3, 2, 5, 8 };
		// Approach-1
		boolean status = Arrays.equals(a, b);
		if (status) {
			System.out.println("Arrays are Equal");
		} else {
			System.out.println("Arrays are Not Equal");
		}

		// Approach-2
		boolean flag = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					flag = false;
					break;
				}
			}
		} else {
			flag = false;
		}
		if (flag) {
			System.out.println("Arrays are Equal");
		} else {
			System.out.println("Arrays are Not Equal");
		}

	}
}
