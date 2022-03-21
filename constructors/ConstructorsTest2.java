package constructors;

class Car1 {
	String model;
	int gear;
	int highSpeed;
	String color;
	int make;
	boolean leftHandDrive;
	String transmission;
	int tyres;
	int doors;
	
	public Car1(String m, int g, int hi, boolean lhd) {
		model = m;
		gear = g;
		highSpeed = hi;
		leftHandDrive = lhd;
	}
	
	public void displayCharacteritics() {
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
public class ConstructorsTest2 {

	public static void main(String[] args) {
		Car1 c = new Car1("VXI",5,250,true);
		c.color = "Maroon";
		c.make = 3;
		c.transmission = "Automatic";
		c.tyres = 5;
		c.doors = 5;
		c.displayCharacteritics();
	}
}