package thisKeyword;

//1. this: to refer current class instance variable
public class Student {
	public static void main(String[] args) {
		Records rd = new Records();
		rd.insert("Ram", 12, "Bhopal");
		rd.show();
	}

}

class Records {
	String name, city;
	int age;

	public void insert(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;

	}

	public void show() {
		System.out.println(name + " " + age + " " + city);

	}

}
