package constructors;

public class ConstructorsTest3 {

	public static void main(String[] args) {
		Car3 c = new Car3();
		c.displayCharacteristics();
		
		c.color="white";
		c.doors=5;
		c.tyres=5;
		c.highSpeed=300;
		c.transmission="auto";
		c.displayCharacteristics();
	}
}