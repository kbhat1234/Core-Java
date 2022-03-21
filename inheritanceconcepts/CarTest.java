package inheritanceconcepts;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car(5);
		c1.setLicensePlate("KA51-Z-8850");
		System.out.println(c1.licencePlate);
		System.out.println(c1.numberOfSeats);
		System.out.println(c1);
		
		SportsCar sc1 = new SportsCar(2, 350);
		sc1.setLicensePlate("KA51-M-9897");
		System.out.println(sc1);
		
	}
}