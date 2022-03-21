package polymorphismconcepts;

class Vehicle {

	public void run() {
		System.out.println("Vehicle is running");
	}
}

class Car extends Vehicle {
	
	public void display() {
		System.out.println("Car is running");
	}
}

public class VehicleTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.run();
		c1.display();
	}
}