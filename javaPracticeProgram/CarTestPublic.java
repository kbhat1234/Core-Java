package javaPracticeProgram;
import vehicle1.Car;

public class CarTestPublic {

	public static void main(String[] args) {
		Car toyota = new Car();
		toyota.model="Camrey";
		toyota.gear=6;
		toyota.highSpeed=220;
		System.out.println(toyota.model+", "+toyota.gear+", "+toyota.highSpeed);
	}
}