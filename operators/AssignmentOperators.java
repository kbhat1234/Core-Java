package operators;

public class AssignmentOperators {
	//Normal Assignment
	static int speed = 80; // speed variable gets the value 80
	static int distance = 20; // distance variable gets the value 20
	static int time = 10; // time variable gets the value 10
	static String name = "ToolsQA"; // name variable gets the value ToolsQA
	static boolean isGood = true; // isGood variable gets the value true

	void method1() {
		//printing the static variables values
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(time);
		System.out.println(name);
		System.out.println(isGood);
		
	}
	
	void method2() {
		//changing the values of static variables and printing
		speed = 100;
		distance =200;
		time = 14;
		name = "welcome to operators";
		isGood = false;
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(time);
		System.out.println(name);
		System.out.println(isGood);
	}
	
	void method3() {
		speed=distance=time=0;
		System.out.println(speed);
		System.out.println(distance);
		System.out.println(time);
		System.out.println(name);
		System.out.println(isGood);
	}
	
	public static void main(String[] args) {
		
		AssignmentOperators op = new AssignmentOperators();
		op.method1();
		op.method2();
		op.method3();

		//Illegal Assignments - Compile time errors
		//speed = "ToolsQA"; //String can not be assign to integer
		//name = 10; // Integer can not be assign to String
		//isGood = "ToolsQa" // String can not be assign to Boolean
		}
	}
