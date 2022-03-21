package bindingconcepts;
/*class Animal {
	private void eat() {
		System.out.println("Animal is eating");
	}
}*/

/*class Dog extends Animal {
	private void eat() {
		System.out.println("Dog is eating");
	}
}*/

class Dog{
	public final void eat(int a) {
		System.out.println("one argument");
	}
	
	public final void eat(int a, int b) {
		System.out.println("two arguments");
	}
	
	public final void eat(int...a) {
		System.out.println("varargs");
	}	
}

public class DogTest{
	public static void main(String args[]) {
		Dog d1 = new Dog();
		d1.eat(10);
		d1.eat(10, 20);
		d1.eat();
		d1.eat(10,20,30,40);
	}
}
/*public class StaticBindingTest {

	public static void main(String[] args) {
		Dog d1;
		d1 = new Dog();
		d1.eat();
		Animal a1;
		a1 = new Animal();
		a1.eat();
	}
}*/