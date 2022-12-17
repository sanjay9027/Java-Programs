package thisKeyword;

//3.this() can be used to invoke current class constructor.
public class Employee {
	public static void main(String[] args) {
		Company emp1 = new Company("Sanjay", 25, "Barbil", 70000);
		emp1.display();
	}

}

class Company {
	String name;
	String city;
	int age, salary;

	// constructor-1
	Company(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	// constructor-2
	Company(String name, int age, String city, int salary) {
//		Rule: Call to this() must be the first statement in constructor.
		this(name, age, city);// calling constructor-1 to initialize 3 values
		this.salary = salary;

	}

	void display() {
		System.out.println(name + " " + age + " " + city + " " + salary);
	}

}
