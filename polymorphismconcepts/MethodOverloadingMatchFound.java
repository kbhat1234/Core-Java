package polymorphismconcepts;

public class MethodOverloadingMatchFound {

	public static void sum(int a, int b) {
		System.out.println("int arg method is invoked");
	}
	
	public static void sum(long a, long b) {
		System.out.println("long arg method is invoked");
	}
	
	public static void main(String[] args) {
		MethodOverloadingMatchFound.sum(10, 20);
		MethodOverloadingMatchFound.sum(10l, 6l);
		
	}

}
