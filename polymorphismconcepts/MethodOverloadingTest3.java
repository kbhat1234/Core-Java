package polymorphismconcepts;

class Add2 {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static double add(int a, int b) {
		return a+b;
	}
}

public class MethodOverloadingTest3 {
	public static void main(String args[]) {
		System.out.println(Add2.add(10, 20));
		System.out.println(Add2.add(20, 5));
	}
}