package polymorphismconcepts;

public class Test {

	public void show(double i) {
		System.out.println("double argument"+i);
	}
	
	public void show(boolean a) {
		System.out.println("int argument");
	}
	
	public void show(int a, boolean b) {
		System.out.println("int and bool argument");
	}
	
	public void show(boolean a, int b) {
		System.out.println("bool and int argument");
	}
	
	public void show(float...a) {
		System.out.println("varargs argument");
	}
	
	public void show(Object a) {
		System.out.println("object method");
	}
	
	public void show(String a) {
		System.out.println("string method");
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		//t1.show("abc"); //string method
		t1.show('a');
		//t1.show(10.33f);
		//t1.show(10,20,30,40);
		//t1.show(true);
		//t1.show(10, false);
		//t1.show(true, 20);
	}
}