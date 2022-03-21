package javaPracticeProgram;
import vehicle3.Car1;

public class Car1Test2Protected extends Car1{

	public static void main(String[] args) {
		Car1Test2Protected c1 = new Car1Test2Protected();
		c1.model="Camrey";
		c1.gear=5;
		c1.highSpeed=230;
		System.out.println(c1.model);
		System.out.println(c1.gear);
		System.out.println(c1.highSpeed);
	}
}