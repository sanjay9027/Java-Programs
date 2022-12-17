package star.patterns;

import java.util.Scanner;

public class RightAngleStars {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
//	logic
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

//	reverse logic
		System.out.println("----------------------");
		for (int m = 0; m < n; m++) {
			for (int p = 0; p < n; p++) {
				if (m < p) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
//		DOWNWARD MIRROR of RIGHT ANGLE triangle

		System.out.println("----------------------");
		for (int k = 0; k < n; k++) {
			for (int l = 0; l < n - k; l++) {
				System.out.print("*");
			}
			System.out.println("");
		}

//		MIRROR of RIGHT ANGLE triangle
		System.out.println("----------------------");
		for (int r = 0; r < n; r++) {
			for (int s = 0; s < n; s++) {
				if (r+s>n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		sc.close();

	}
}
