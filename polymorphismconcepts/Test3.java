package polymorphismconcepts;

public class Test3 {
	
	public void show(int a) {
		System.out.println("int method");
	}
	
	public void show(int... a) {//varargs
		System.out.println("varargs method");
	}
	
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.show(10); //int method
		t.show(10,20,30);//varargs method
		t.show(); //varargs method
	}
}