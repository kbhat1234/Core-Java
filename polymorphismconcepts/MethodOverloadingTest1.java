package polymorphismconcepts;

class Add {
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int add(int a) {
		return a+10;
	}
}

public class MethodOverloadingTest1 {
	public static void main(String args[]) {
		//Add.add(10, 20);
		//Add.add(10, 20, 5);
		int two = Add.add(10,20);
		int three = Add.add(10, 20, 5);
		int one = Add.add(10);
		System.out.println("Sum of 2 numbers is "+two);
		System.out.println("Sum of 3 numbers is "+three);
		System.out.println("Sum is "+one);
	}
}