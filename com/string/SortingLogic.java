package com.string;

public class SortingLogic {

	public static void main(String[] args) {
		String str = "silent";

		char[] result = sortArray(str);
		System.out.println(result);

	}

	static char[] sortArray(String str) {
		char[] arr = str.toCharArray();
		char temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j =i+1; j < arr.length; j++) {
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
