package runtimepoly;

class Bike {
	public void run() {
		System.out.println("bike is running");
	}
}

class Splendor extends Bike {
	public void run() {
		System.out.println("splendor bike is running");
	}
}

class Kawasaki extends Bike {
	public void run() {
		System.out.println("Kawasaki bike is running");
	}
}

class Fazer extends Bike {
	// no methods in fazer class
}

public class BikeTest {

	public static void main(String[] args) {
		Bike b;
		b = new Splendor();
		b.run(); //upcasting here splendor run() method is invoked
		
		b = new Kawasaki();
		b.run(); //upcasting
		
		b = new Fazer();
		b.run();
		
		//Bike b1 = new Bike();
		//b1.run(); // bike class run() method is invoked
		
		//Splendor s = new Splendor();
		//s.run(); //splendor class run() method is invoked
	}

}
