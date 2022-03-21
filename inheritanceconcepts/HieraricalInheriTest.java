package inheritanceconcepts;

class Animal2 {
	public void eat() {
		System.out.println("eating ...");
	}
}

class Dog2 extends Animal2 {
	public void bark() {
		System.out.println("barking ...");
	}
}

class BabyDog2 extends Animal2 {
	public void weep() {
		System.out.println("weeping ...");
	}
}

public class HieraricalInheriTest {

	public static void main(String[] args) {
		Dog2 d2 = new Dog2();
		d2.bark();
		d2.eat();
		//d2.weep(); compile time error
		
		BabyDog2 bd2 = new BabyDog2();
		bd2.eat();
		bd2.weep();
		//bd2.bark(); compile time error
	}
}