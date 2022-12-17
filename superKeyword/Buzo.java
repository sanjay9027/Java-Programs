package superKeyword;

//3.super() can be used to invoke immediate parent class constructor.
public class Buzo {
	public static void main(String args[]) {
		Dog d = new Dog();
	}
}

//child class
class Dog extends Animal {
	Dog() {
		super();
		System.out.println("dog is created  " + "-> child class");
	}
}

//parent class
class Animal {
	Animal() {
		System.out.println("animal is created  " + "-> parent class");
	}
}
