package polymorphismconcepts;

public class Test4 {
	
	public void show(Object a) {
		System.out.println("object method");
	}
	
	public void show(StringBuffer a) {
		System.out.println("StringBuffer method");
	}
	
	public void show(String a) {
		System.out.println("string method");
	}
	
	public void show(Object... a) {
		System.out.println("var objects method");
	}
	
	public static void main(String[] args) {
		Test4 t = new Test4();
		t.show(new String("Welcome")); //string method
		t.show(new StringBuffer("Welcome to Java")); //stringbuffer method
		t.show('a'); //object method
		t.show(); //var objects method

	}
}