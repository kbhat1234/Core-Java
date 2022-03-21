package polymorphismconcepts;

public class Test1 {
	public void show(Object a) {
		System.out.println("object method");
	}
	
	public void show(String a) {
		System.out.println("string method");
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.show(10.34f);
	}

}
