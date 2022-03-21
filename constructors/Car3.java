package constructors;

public class Car3 {
	String model,color,transmission;
	int gear,doors,tyres,make,highSpeed;
	boolean leftHandDrive;
	
	//default values set in constructor
	public Car3() {
		model = "Camry";
		make = 2010;
		leftHandDrive = true;
	}
	
	public void displayCharacteristics() {
		System.out.println(model+", "+color+", "+transmission);
		System.out.println(gear+", "+doors+", "+tyres+", "+make+", "+highSpeed);
		System.out.println(leftHandDrive);
	}
}