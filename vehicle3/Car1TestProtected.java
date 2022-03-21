package vehicle3;

public class Car1TestProtected{

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		c1.model="Punto";
		c1.gear=5;
		c1.highSpeed=230;
		System.out.println(c1.model);
		System.out.println(c1.gear);
		System.out.println(c1.highSpeed);
	}

}
