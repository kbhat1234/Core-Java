package operators;

public class UnaryOperator {

	public static void main(String args[]) {
		int a = 10;
		boolean b = true;
		/*
		System.out.println(a++);//10
		System.out.println(a);//11
		
		System.out.println(++a);//12
		System.out.println(a);//12
		
		System.out.println(a--);//12
		System.out.println(a);//11
		
		System.out.println(--a);//10
		System.out.println(a);//10
		*/
		
		//System.out.println(a++ + ++a);//10+12=22
		System.out.println(~a);
		System.out.println(!b);
		
		
	}
}