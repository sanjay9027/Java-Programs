package exception.handling;
/*To handle the exception, we have put the code, 5 / 0 inside the try block. Now when an exception occurs,
 * the rest of the code inside the try block is skipped.*/

/*The catch block catches the exception and statements inside the catch block is executed.
 *  If none of the statements in the try block generates an exception, the catch block is skipped.*/
public class ArithmeticExceptionExample {

	public static void main(String[] args) {

		int num = 5;
		try {
			int res = num / 0;
			System.out.println(res);
		} catch (Exception e) {
			
			System.out.println("hi");
			System.out.println("ArithmeticException " + e.getMessage());
		}
		System.out.println("hello world");
	}
}
