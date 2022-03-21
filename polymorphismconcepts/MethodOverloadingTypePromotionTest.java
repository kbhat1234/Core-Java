package polymorphismconcepts;

public class MethodOverloadingTypePromotionTest {

	public  static void sum(int a, float b) {
		System.out.println(a+b);
	}
	
	public  static void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		MethodOverloadingTypePromotionTest.sum(10, 20);//2nd int literal will be promoted to long
		MethodOverloadingTypePromotionTest.sum(10, 50f);
		MethodOverloadingTypePromotionTest.sum(10, 20, 30);
	}
}