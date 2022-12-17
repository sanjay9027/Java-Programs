package exception.handling;

/*In Java, the finally block is always executed no matter whether there is an exception or not.
The finally block is optional. And, for each try block, there can be only one finally block.
Note: It is a good practice to use the finally block. It is because it can include important cleanup codes like,
1.code that might be accidentally skipped by return, continue or break
2.closing a file or connection*/
public class FinallyBlock {

	public static void main(String[] args) {
		try {
			int div = 5 / 0;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println(e.getClass() + "    " + e.getMessage());
			System.out.println("hello world");
		} finally {
			System.out.println("This is the finally block");
		}
	}
}
