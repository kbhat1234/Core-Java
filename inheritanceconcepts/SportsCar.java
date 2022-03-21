package inheritanceconcepts;

public class SportsCar extends Car {
	double maxSpeed = 0;
	
	public SportsCar(int ns, double s) {
		super(ns);
		maxSpeed = s;
	}
	@Override
	public void setLicensePlate(String license) {
		this.licencePlate = license.toLowerCase();
	}
	
	@Override
	public String toString() {
		return super.toString()+". Its max speed is "+maxSpeed;
	}
}