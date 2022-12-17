package com.string;

public class CapitalizeString {
	public static void main(String[] args) {
		String str = "hello world new year";
		String result = capitalize(str);
		System.out.println(str+" -> "+result);
	}

	public static String capitalize(String str) {
		char[] ch = str.toCharArray();
		ch[0] = Character.toUpperCase(ch[0]);
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == ' ' && ch[i + 1] != ' ') {
				ch[i + 1] = Character.toUpperCase(ch[i + 1]);

			}
		}
//		System.out.println(Arrays.toString(ch));
		String res = String.valueOf(ch);
		return res;
	}

}
