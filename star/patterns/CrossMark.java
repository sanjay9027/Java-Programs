package star.patterns;

import java.util.Scanner;

//Write a program to display CROSS mark with stars
public class CrossMark {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (j == i || (i + j) == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			Thread.sleep(2000);
			System.out.println("");

		}
		sc.close();
	}
}
