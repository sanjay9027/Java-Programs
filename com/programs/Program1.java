
//Write a program to Print 1 to N numbers and their SUM?

package com.programs;
import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		//calculating sum & printing number
		System.out.print("Numbers are ");
		int sum=0;
		for(int i=1;i<=num;i++) {
			
			sum=sum+i;
			System.out.print(i+" ");
			
		}
		System.out.println("");
		System.out.println("Sum is :"+ sum);
		
		
		
		
		sc.close();
	}

}
