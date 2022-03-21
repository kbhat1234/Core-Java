package inheritanceconcepts;

public class Car  extends Vehicle {
	protected int numberOfSeats = 0;
	
	public Car(int noOfSeats) {
		super();
		numberOfSeats = noOfSeats;
	}
	
	public void setLicensePlate(String license) {
		super.setLicensePlate(license);
	}
	
	public String toString() {
		return "The car has "+numberOfSeats+ " seat. Its license plate is "+licencePlate;
	}
	
	public int getNumberOfSeats() {
		return this.numberOfSeats;
	}
}