package datatypes;
public class Variables {
	static int num=20; //static variable
	public void method1() {
		int num=90; //local variable
		System.out.println("local variable value is " +num);
		System.out.println("static variable access " +Variables.num);
	}
	public void method2() {
		System.out.println("static variable value is " +Variables.num);
	}
	public static void main(String args[]) {
		int data=50;
		System.out.println("Instance variable value is " +data);//instance variable
		Variables v1 = new Variables();
		v1.method1();
		v1.method2();
	}
}