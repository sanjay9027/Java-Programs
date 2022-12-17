package star.patterns;

import java.util.Scanner;

public class InvertedStars {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
//		logic
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j<=n-1-i) {
					System.out.print("*");
					
				}
			}
			System.out.println("");
			
		}
		sc.close();
			
		
	}
}
