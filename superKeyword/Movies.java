package superKeyword;

//2.super can be used to invoke immediate parent class method.
public class Movies {
	public static void main(String[] args) {
		HindiMovie hm = new HindiMovie();
		hm.film();
	}

}

class HindiMovie extends SouthMovie {
	void film() {
		System.out.println("my fav movie is ");
		super.bestMovie(); // calling SouthMovie/ parent class method
	}

	void bestMovie() {
		System.out.println("KGF");
	}
}

class SouthMovie {
	void bestMovie() {
		System.out.println("KGF");
	}
}
