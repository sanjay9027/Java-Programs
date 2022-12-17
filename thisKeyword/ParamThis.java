package thisKeyword;

//4.this can be passed as an argument in the method call.
public class ParamThis {
	void run(ParamThis obj) {
		System.out.println("run method");

	}

	void skip() {
		run(this);
		System.out.println("Skip method");
	}

	public static void main(String[] args) {
		ParamThis pt = new ParamThis();
		pt.skip();
	}

}
