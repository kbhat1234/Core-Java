package accessmodifiers;

class A {

	int id;
	String name;
	
	void display() {
		System.out.println(id);
		System.out.println(name);
	}
}

class B extends A{
	public int age;
	public String lname;
}

public class ABTest{
	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		
		a.id=1002;
		a.name="Karthik";
		a.display();
		
		b.age=43;
		b.lname="bhat";
		System.out.println(b.age);
		System.out.println(b.lname);
	}
}
