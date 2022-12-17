package com.string;

import java.util.Scanner;

public class Palindrome {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string without space");
		String str=sc.nextLine();
		
		String rev=reverseString(str);
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
		sc.close();
	}

	 static String reverseString(String str) {
		 char[] ch=str.toCharArray();
		 String tempStr="";
		 for(int i=ch.length-1;i>=0;i--) {
			 tempStr=tempStr+ch[i];
		 }
	
		return tempStr;
	}
}
