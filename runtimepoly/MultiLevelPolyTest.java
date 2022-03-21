package runtimepoly;

class Ani1 {
	public void eat() {
		System.out.println("eating food");
	}
}

class Dg1 extends Ani1 {
	public void eat() {
		System.out.println("dog eating food");
	}
}

class BDg1 extends Dg1 {
	/*public void eat() {
		System.out.println("baby dog eating food");
	}*/
}

public class MultiLevelPolyTest {

	public static void main(String[] args) {
		Ani1 a1, a2, a3;
		a1 = new Ani1();
		a2 = new Dg1();
		a3 = new BDg1();
		a1.eat();
		a2.eat();
		a3.eat();
	}
}