package com.string;
import java.util.Scanner;

public class RemoveSpaces extends SortingLogic {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string with spaces");
		String str=sc.nextLine();
		
		String res=removeSpace(str);
		System.out.println(res);
		char[] ch1=sortArray(res);
		System.out.println(ch1);
		sc.close();
	}

	public static String removeSpace(String str) {
		char[] ch=str.toCharArray();
		String str1 = "";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				str1=str1+ch[i];
			}
		}
		return str1;
		
		
	}

}
