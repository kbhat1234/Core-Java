package runtimepoly;

class Animal {
	int speedLimit = 90;
	public void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	int speedLimit = 120;
	public void eat() {
		System.out.println("eating dog food");
	}
}

class Cat extends Animal {
	int speedLimit =95;
	public void eat() {
		System.out.println("eating cat food");
	}
}

class Lion extends Animal {
	int speedLimit = 110;
	public void eat() {
		System.out.println("eating raw meat");
	}
}

class Tiger extends Animal {
	int speedLimit = 125;
	public void eat() {
		System.out.println("eating red meat");
	}
}

class Leopard extends Animal {
	// no method here
}


public class AnimalTest {

	public static void main(String[] args) {
		/*Animal a;
		
		a = new Dog();
		System.out.println(a.speedLimit);
		a.eat();
		
		a = new Cat();
		System.out.println(a.speedLimit);
		a.eat();
		
		a = new Lion();
		System.out.println(a.speedLimit);
		a.eat();
		
		a = new Tiger();
		System.out.println(a.speedLimit);
		a.eat();
		
		a = new Leopard();
		System.out.println(a.speedLimit);
		a.eat();*/
		
		Dog d = new Dog();
		System.out.println(d.speedLimit);
		d.eat();
		
		Cat c = new Cat();
		System.out.println(c.speedLimit);
		c.eat();
	}
}