package constructors;

public class Car4 {
	
	private String model;
	private int make;
	int gear;
	int highSpeed;
	
	protected Car4() {
		model = "punto";
		make = 2012;
	}
	
	public void display() {
		System.out.println(model+", "+make+", "+gear+", "+highSpeed);
	}
}
