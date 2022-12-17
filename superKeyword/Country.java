package superKeyword;

//1.super keyword can be used to refer immediate parent class instance variable.
public class Country {
	public static void main(String[] args) {
		Odisha od = new Odisha();
		od.show();

	}

}

class Odisha extends India {
	String language = "odia";

	void show() {
		System.out.println(language);

		System.out.println(super.language);// use of super
	}

}

class India {
	String language = "hindi";
}
