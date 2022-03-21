package inheritanceconcepts;

class Operation {
	public int square(int n) {
		return n*n;
	}
}

public class Circle {
	Operation op;
	final static double pi = 3.14;
	
	public double area(int radius) {
		op = new Operation();
		int result = op.square(radius);
		return pi*result;	
	}
	
	public static void main(String args[]) {
		Circle c = new Circle();
		double r = c.area(3);
		System.out.println("Area of the circle is "+r);
	}
}