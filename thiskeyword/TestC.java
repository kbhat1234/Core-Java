package thiskeyword;

class C {
	public C() {
		this(5);
		System.out.println("Hello C");
	}
	
	public C(int x) {
		System.out.println(x);
	}
}

public class TestC {

	public static void main(String[] args) {
		C c1 = new C();
	}
}