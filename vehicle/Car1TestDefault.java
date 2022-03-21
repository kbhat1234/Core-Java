package vehicle;

public class Car1TestDefault {

	public static void main(String[] args) {
		Car1 toyota = new Car1();
		toyota.model="Etios";
		toyota.gear=6;
		toyota.highSpeed=200;
		System.out.println(toyota.model+", "+toyota.gear+", "+toyota.highSpeed);
	}
}