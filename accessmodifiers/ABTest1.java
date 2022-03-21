package accessmodifiers;
public class ABTest1 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		a.id=1002;
		a.name="Rini";
		a.display();
		
		b.age=41;
		b.lname="Das bhat";
		System.out.println(b.age);
		System.out.println(b.lname);

	}

}
