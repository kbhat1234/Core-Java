package javaPracticeProgram;
import vehicle.Car1;
public class Car1TestDefault {

	public static void main(String[] args) {
		Car1 toyota = new Car1();
		toyota.model="Etios"; //compile time error
		toyota.gear=6; //compile time error
		toyota.highSpeed=200; //compile time error
		System.out.println(toyota.model+", "+toyota.gear+", "+toyota.highSpeed);
	}
}