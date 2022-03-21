package runtimepoly;

class A1 {
	public void eat() {
		System.out.println("eating...");
	}
}

class D1 extends A1 {
	public void eat() {
		System.out.println("eating dog food");
	}
}

class BD1 extends D1 {
	public void eat() {
		System.out.println("eating baby dog food");
	}
	public static void main(String[] args) {
		A1 a1, a2, a3;
		a1 = new A1();
		a1.eat();
		a2 = new D1();
		a2.eat();
		a3 = new BD1();
		a3.eat();
	}
}