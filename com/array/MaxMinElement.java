package com.array;
public class MaxMinElement {

	public static void main(String[] args) {
		int a[] = { 1, 5, 2, 3, 7, 8, 23, 66, 11, 0, 3, 90 };

		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("maximum number is -> " + max);
		
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("minimum number is -> " + min);
	}
}
