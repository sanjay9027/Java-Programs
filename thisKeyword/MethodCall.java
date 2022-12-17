package thisKeyword;

//2.this can be used to invoke current class method (implicitly)
public class MethodCall {
	public static void main(String[] args) {
		Test ts = new Test();
		ts.walk();

	}

}

class Test {
	void walk() {
		run(); // compiler automatically adds this keyword while invoking the method.
		System.out.println("Walk Method");
	}

	void run() {
		System.out.println("Run Method");
	}
}
