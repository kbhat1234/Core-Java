package operators;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 40;
		boolean bValue;
		int iValue;
		
		bValue = (c==a+b)?true:false;
		System.out.println(bValue);
		
		iValue = ((c==b+a)) ? 1:0;
		System.out.println(iValue);
		
		iValue = (!(c==a+b)) ? 1 : 0;
		System.out.println(iValue);
	}
}