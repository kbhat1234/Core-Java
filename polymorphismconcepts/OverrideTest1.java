package polymorphismconcepts;

class P1 {
	public void show() {
		System.out.println("1");
	}
}

class C1 extends P1 {
	public void show() {
		System.out.println("2");
	}
}

public class OverrideTest1 {
	public static void main(String args[]) {
		P1 p = new P1();
		p.show();
		C1 c = new C1();
		c.show();
	}
}