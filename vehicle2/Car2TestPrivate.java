package vehicle2;

public class Car2TestPrivate {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.model="Camrey";
		c1.gear=5;
		c1.highSpeed=222;
		//c1.display(); //compile time error
		c1.print();
	}

}
