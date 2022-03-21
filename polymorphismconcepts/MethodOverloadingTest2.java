package polymorphismconcepts;
class Add1 {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static double add(double a, double b) {
		return a+b;
	}
}

public class MethodOverloadingTest2 {
	public static void main(String args[]) {
		int two = Add1.add(10, 20);
		System.out.println("Sum of 2 numbers is "+two);
		double two1 = Add1.add(10.1, 5.2);
		System.out.println("The sum of 2 numbers is "+two1);
		System.out.println(Add1.add(10, 20));
	}
}