package class_objects;

class Car {
	static String sModel;
	static int iGear;
	static String color;
	static String sMake;
	
	public static void displayCharacteristics() {
		System.out.println(sModel);
		System.out.println(iGear);
		System.out.println(color);
		System.out.println(sMake);
	}
}

public class ClassTestExercise {

	public static void main(String[] args) {
		//Car toyota = new Car();
		//Car fiat = new Car();
		//toyota.sModel="Innova Crysta";
		//toyota.iGear=6;
		//toyota.color="red";
		//toyota.sMake="Petrol";
		
		//fiat.sModel="punto";
		//fiat.iGear=5;
		//fiat.color="white";
		//fiat.sMake="Disel";
		Car.iGear=5;
		Car.color="red";
		Car.sModel="Punto";
		Car.sMake="Fiat";
		
		Car.displayCharacteristics();
	}

}
