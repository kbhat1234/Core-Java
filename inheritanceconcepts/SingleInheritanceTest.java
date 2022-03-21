package inheritanceconcepts;

class Animal {
	public void eat() {
		System.out.println("Eating ...");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("dog is barking ...");
	}
}

public class SingleInheritanceTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		
		Animal a = new Animal();
		a.eat();
		//a.bark(); compile time error
	}
}