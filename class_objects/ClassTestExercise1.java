package class_objects;
/**
 * 
 * @author admin
 *
 */
class Car1 {
	static String sModel;
    static int iGear;
    static int iHighestSpeed;
    static String sColor;
    static int iMake;
    static boolean bLeftHandDrive;
    static String sTransmission;
    static int iTyres;
    static int iDoors;
    
    public static void getCharacteristics() {
    	sModel = "Punto";
    	iGear = 5;
    	iHighestSpeed=200;
    	sColor="red";
    	iMake=2014;
    	bLeftHandDrive=true;
    	sTransmission="Manual";
    	iTyres=4;
    	iDoors=5;	
    }
    public static void displayCharacteristics() {
    	System.out.println(sModel);
    	System.out.println(iGear);
    	System.out.println(iHighestSpeed);
    	System.out.println(sColor);
    	System.out.println(iMake);
    	System.out.println(bLeftHandDrive);
    	System.out.println(sTransmission);
    	System.out.println(iTyres);
    	System.out.println(iDoors);
    }
}

public class ClassTestExercise1 {

	public static void main(String[] args) {
		Car1.getCharacteristics();
		Car1.displayCharacteristics();

	}

}
