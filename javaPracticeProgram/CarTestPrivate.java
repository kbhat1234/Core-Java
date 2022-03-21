package javaPracticeProgram;
import vehicle2.Car1;

public class CarTestPrivate {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		c1.nodel = "Camrey"; //compile time error
		c1.gear=5; //compile time error
		c1.highSpeed=230; //compile time error
		c1.display();

	}

}
