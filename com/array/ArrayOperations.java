package com.array;

public class ArrayOperations {

	public static void main(String[] args) {
		int a[] = { 24, 76, 4, 6, 9, 78, 100 };
		int sum = 0;
		int even_count = 0, oddd_count = 0;
		int even_sum = 0, odd_sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			if (a[i] % 2 == 0) {
				even_count++;
				even_sum += a[i];
			} else {
				oddd_count++;
				odd_sum += a[i];
			}
		}
		System.out.println("Sum:" + sum);
		System.out.println("Even number:" + even_count);
		System.out.println("odd numbrs:" + oddd_count);
		System.out.println("Even digit sum " + even_sum);
		System.out.println("ODD digit sum " + odd_sum);
	}
}
