package inheritanceconcepts;

public class Vehicle {
	protected String licencePlate = null;
	
	public void setLicensePlate(String license) {
		System.out.println("This is super class method invoked");
		this.licencePlate = license;
	}
}