package oopsProgs;


abstract class Animal{

	abstract void sound();
	abstract void eating();
	void show() {
		System.out.println("Show from abstract class");
	}
}


class Dog extends Animal{
	void sound() {
		System.out.println("Dog Sounds Like boww..");
	}
	void eating() {
		System.out.println("Dogs eat non-veg");
	}
}

class Cow extends Animal{
	void sound() {
		System.out.println("Cow sounds like ambbaa..");
	}
	void eating() {
		System.out.println("Cows eat veg");
	}
}

public class AbstractClassEx {

	public static void main(String[] args) {
		
//		Animal a = new Animal();
		
		//Animal a; // reference
		
		Animal a = new Dog();
		
		a.eating();
		a.sound();
		
		a = new Cow();
		
		a.eating();
		a.sound();
		a.show();
	}

}
