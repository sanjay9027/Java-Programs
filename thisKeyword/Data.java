package thisKeyword;

//6.this can be used to return the current class instance from the method.
public class Data {
	public static void main(String[] args) {
		Volume vol = new Volume();
		System.out.println("direct : " + vol);
		System.out.println("------------------------------");
		System.out.println("this return: " + vol.show());
	}

}

class Volume {

	public Volume show() {
		return this;

	}

}
