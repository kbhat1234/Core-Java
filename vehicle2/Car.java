package vehicle2;

public class Car {
	
	private String model;
	private int gear;
	private int highSpeed;
	
	public void display() {
		System.out.println(model+", "+gear+", "+highSpeed);
	}
	
	public static void main(String args[]) {
		Car c1 = new Car();
		c1.model="etios";
		c1.gear=5;
		c1.highSpeed=230;
		c1.display();
	}
}
