package polymorphismconcepts;

public class MethodOverloadingAmbiguity {

	public static void sum(int a, long b) {
		System.out.println("sum(int,long) method is invoked");
	}
	
	public static void sum(long a, int b) {
		System.out.println("sum(long,int) method is invoked");
	}
	
	public static void main(String args[]) {
		//MethodOverloadingAmbiguity.sum(10, 10); //ambiguity
		MethodOverloadingAmbiguity.sum(10l, 9);
		MethodOverloadingAmbiguity.sum(10, 11l);
	}
}