package vehicle2;

public class Car2 {
	public String model;
	public int gear;
	public int highSpeed;
	
	private void display() {
		System.out.println(model);
		System.out.println(gear);
		System.out.println(highSpeed);
	}
	public void print() {
		display();
	}
}