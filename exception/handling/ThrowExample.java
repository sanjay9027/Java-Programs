package exception.handling;

/*The Java throw keyword is used to explicitly throw a single exception.
 * When we throw an exception, the flow of the program moves from the try block to the catch block.*/
public class ThrowExample {
	public static void main(String[] args) {
		divideByZero();

	}

	public static void divideByZero() {

		throw new ArithmeticException("Throwing a exception :)");

	}
}
