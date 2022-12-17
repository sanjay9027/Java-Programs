package com.string;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "hello world";
		char key;
		for (char j = 'a'; j <= 'z'; j++) {
			key = j;
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (key == str.charAt(i)) {
					count++;
				}

			}
			if (count != 0) {
				System.out.println(j + " = " + count);
			}
		}

	}
}
