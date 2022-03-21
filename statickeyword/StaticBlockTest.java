package statickeyword;

class StaticBlockTest {
	
	static String college;
	public static void display() {
		System.out.println(college);
	}
	static {
		college = "NMIT";
		System.out.println("This is a static block 1");
		System.out.println(college);
		display();
	}
	
	public static void main(String args[]) {
		System.out.println("This is a main method");
		System.out.println(StaticBlockTest.college);
	}
	static {
		System.out.println("This is a static block 2");
	}
}