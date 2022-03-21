package constructors;

class Car {
	String model;
	int gear;
	int highSpeed;
	String color;
	int make;
	boolean leftHandDrive;
	String transmission;
	int tyres;
	int doors;
	
	public Car() {
		
	}
	
	public void displayCharacteristics() {
		System.out.println(model);
		System.out.println(gear);
		System.out.println(highSpeed);
		System.out.println(color);
		System.out.println(make);
		System.out.println(leftHandDrive);
		System.out.println(transmission);
		System.out.println(tyres);
		System.out.println(doors);
	}
}

public class ConstructorsTest1 {

	public static void main(String[] args) {
		Car c = new Car();
		c.displayCharacteristics();

	}

}
