package vehicle;

public class CarTestDefault {

	public static void main(String[] args) {
		Car fiat = new Car();
		fiat.model="punto";
		fiat.gears=5;
		fiat.highestSpeed=230;
		System.out.println(fiat.model);
		System.out.println(fiat.gears);
		System.out.println(fiat.highestSpeed);
	}
}