package thiskeyword;

class A {
	
	public void m() {
		System.out.println("This is method m()");
	}
	
	public void n() {
		this.m();
	}	
}

public class TestThis4 {

	public static void main(String[] args) {
		A a = new A();
		a.n();
	}
}
