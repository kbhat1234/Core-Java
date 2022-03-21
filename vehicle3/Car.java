package vehicle3;

public class Car {
	protected String model;
	protected int gear;
	public int highSpeed;
	public static void main(String args[]) {
		Car c1 = new Car();
		c1.gear=5;
		c1.model="punto";
		c1.highSpeed=300;
		System.out.println(c1.model+", "+c1.gear+", "+c1.highSpeed);
	}
}