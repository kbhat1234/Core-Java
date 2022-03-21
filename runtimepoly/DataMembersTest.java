package runtimepoly;

class Bike10 {
	int speedLimit = 90;
}

class Honda extends Bike10 {
	int speedLimit = 100;
}

public class DataMembersTest {

	public static void main(String[] args) {
		Bike10 b;
		b =  new Honda();
		System.out.println(b.speedLimit);
	}
}