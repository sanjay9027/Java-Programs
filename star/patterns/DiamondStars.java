package star.patterns;

import java.util.Scanner;

public class DiamondStars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
//		upper pyramid
		for (int i = 1; i < n; i++) {
			for (int sp = 1; sp <= (n - i); sp++) {
				System.out.print(" ");
			}
			for (int start = 1; start <= (2 * i - 1); start++) {
				System.out.print("*");
			}
			System.out.println(" ");

		}
//		reverse pyramid
		for (int i = n; i >= 1; i--) {
			for (int sp = 1; sp <= (n - i); sp++) {
				System.out.print(" ");
			}
			for (int start = 1; start <= (2 * i - 1); start++) {
				System.out.print("*");
			}
			System.out.println("");

		}
		sc.close();
	}

}
