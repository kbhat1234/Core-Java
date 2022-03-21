package datatypes;

public class VariablePlay {

	public static void main(String[] args) {
		int num = 10;
		float fl = num; // widening the variable value from int to float
		System.out.println("Integer to float is " +fl);
		System.out.println("Integer value is " +num);
		int num1 = (int)fl;
		System.out.println("float to int is " +num1); //narrowing
		double d1 = fl;
		System.out.println(d1);

	}

}
