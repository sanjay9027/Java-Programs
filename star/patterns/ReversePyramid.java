package star.patterns;
public class ReversePyramid {
	public static void main(String[] args) {
		int n = 5;
		for (int i = n; i >= 1; i--) {
			for (int sp =1; sp <=(n-i) ; sp++) {
				System.out.print(" ");
			}
			for (int start = 1; start <= (2 * i - 1); start++) {
				System.out.print("*");
			}
			System.out.println("");
			
			
		}
	}
}
