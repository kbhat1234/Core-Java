package polymorphismconcepts;

class TwoWheeler {
	public void run() {
		System.out.println("Two wheeler is running");
	}
}

class Honda extends TwoWheeler {
	public void run() {
		System.out.println("Honda Scooter is running");
	}
}

public class MethodOverridingTest {

	public static void main(String[] args) {
		Honda h1 = new Honda();//creating reference object of child class Honda 
		h1.run();//child method run() is invoked
	}
}