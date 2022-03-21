package thiskeyword;

class B {
	public B(){
		System.out.println("Default constructor");
	}
	
	public B(int x) {
		System.out.println(x);
	}
}

public class TestA {
	public static void main(String[] args) {
		B a1 = new B();
		B a2 = new B(10);
	}

}
