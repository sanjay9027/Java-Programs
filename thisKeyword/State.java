package thisKeyword;

//5.this can be passed as argument in the constructor call.
public class State {
	String name = "Bhubaneswar";

	State() {
		City ct = new City(this);//passed argument
		ct.display();

	}

	public static void main(String[] args) {
		State st = new State();
	}

}

class City {
	State obj1;

	public City(State obj1) {
		this.obj1 = obj1;
	}

	void display() {
		System.out.println(obj1.name);

	}

}
