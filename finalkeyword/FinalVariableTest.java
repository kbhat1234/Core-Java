package finalkeyword;

public class FinalVariableTest {

	public static void main(String[] args) {
	    final int i = 10;
		i = 20; //cannot change value of i as it is declared as final
		int area;
		area = 2*i;
		System.out.println(i);
		System.out.println(area);
	}
}
