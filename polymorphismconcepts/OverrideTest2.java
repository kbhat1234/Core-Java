package polymorphismconcepts;

class P2 {
	public Object show() {
		System.out.println("1");
		return null;
	}
}

class C2 extends P2 {
	public String show() {
		System.out.println("2");
		return null;
	}
}

public class OverrideTest2 {

	public static void main(String[] args) {
		P2 p = new P2();
		p.show();
		
		C2 c = new C2();
		c.show();
	}
}