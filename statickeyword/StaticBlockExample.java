package statickeyword;

public class StaticBlockExample {
	
	static String college;
	
	static {
		college = "Nitte Institute of Technology";
		System.out.println("This is static block 1");
	}
	
	public static void display() {
		System.out.println(college);
	}
	
	public static void main(String args[]) {
		System.out.println("This is main method");
		StaticBlockExample.display();
	}
	
	static {
		System.out.println("Thisis static block 2");
	}
}