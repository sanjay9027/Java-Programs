package com.string;

public class CountWords {

	public static void main(String[] args) {
		String str="hello world new year";
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' '&& str.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println("Number of words -> "+count);
	}
}
