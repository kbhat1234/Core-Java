package inheritanceconcepts;

class Animal1 {
	public void eat() {
		System.out.println("eating ...");
	}
}

class Dog1 extends Animal1 {
	public void bark() {
		System.out.println("barking ...");
	}
}

class BabyDog1 extends  Dog1 {
	public void weep() {
		System.out.println("weeping ...");
	}
}

public class MultiLevelInherTest {

	public static void main(String[] args) {
		BabyDog1  bd1 = new BabyDog1();
		bd1.eat();
		bd1.bark();
		bd1.weep();
		
		Dog1 d1 = new Dog1();
		d1.bark();
		d1.eat();
		//d1.weep(); //compile time error
		
		Animal1 a1 = new Animal1();
		a1.eat();
		//a1.bark();//compile time error
		//a1.weep(); //compile time error
	}
}