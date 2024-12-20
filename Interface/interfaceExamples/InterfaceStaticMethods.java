package interfaceExamples;

interface AnimalInterface {
	void eat();

	void sound();

	void walk();

	public static void drink() {
		System.out.println("Can't survive without Water");
	}

	public static void sleep() {
		System.out.println("Can't survive without Sleep");
	}
}

class Human implements AnimalInterface {

	@Override
	public void eat() {
		System.out.println("Veg & Non-Veg");
	}

	@Override
	public void sound() {
		System.out.println("Any");
	}

	@Override
	public void walk() {
		System.out.println("2-Legs");
	}

}

class Lion implements AnimalInterface {
	@Override
	public void eat() {
		System.out.println("Non-Veg");
	}

	@Override
	public void sound() {
		System.out.println("Roar");
	}

	@Override
	public void walk() {
		System.out.println("4-Legs");
	}
}

class Elephant implements AnimalInterface {
	@Override
	public void eat() {
		System.out.println("Veg");
	}

	@Override
	public void sound() {
		System.out.println("Trumpet");
	}

	@Override
	public void walk() {
		System.out.println("4-Legs");
	}
}

class Dog implements AnimalInterface {
	@Override
	public void eat() {
		System.out.println("Veg & Non-Veg");
	}

	@Override
	public void sound() {
		System.out.println("Bark");
	}

	@Override
	public void walk() {
		System.out.println("4-Legs");
	}
}

class Cat implements AnimalInterface {
	@Override
	public void eat() {
		System.out.println("Veg & Non-Veg");
	}

	@Override
	public void sound() {
		System.out.println("Meow");
	}

	@Override
	public void walk() {
		System.out.println("4-Legs");
	}
}

public class InterfaceStaticMethods {

	public static void main(String[] args) {
		
		System.out.println("Human:");
		Human h = new Human();
		h.eat();
		AnimalInterface.drink();
		h.sound();
		h.walk();
		AnimalInterface.sleep();

		System.out.println("-------------------------------\n");

		System.out.println("Lion:");
		Lion l = new Lion();
		l.eat();
		AnimalInterface.drink();
		l.sound();
		l.walk();
		AnimalInterface.sleep();

		System.out.println("-------------------------------\n");

		System.out.println("Elephant:");
		Elephant e = new Elephant();
		e.eat();
		AnimalInterface.drink();
		e.sound();
		e.walk();
		AnimalInterface.sleep();

		System.out.println("-------------------------------\n");

		System.out.println("Dog:");
		Dog d = new Dog();
		d.eat();
		AnimalInterface.drink();
		d.sound();
		d.walk();
		AnimalInterface.sleep();

		System.out.println("-------------------------------\n");

		System.out.println("Cat:");
		Cat c = new Cat();
		c.eat();
		AnimalInterface.drink();
		c.sound();
		c.walk();
		AnimalInterface.sleep();

	}

}
