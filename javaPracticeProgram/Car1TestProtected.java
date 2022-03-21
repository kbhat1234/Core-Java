package javaPracticeProgram;
import vehicle3.Car1;

public class Car1TestProtected{

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		c1.model="Punto"; //compile time error
		c1.gear=5; //compile time error
		c1.highSpeed=230;
	}
}