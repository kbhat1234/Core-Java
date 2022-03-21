package runtimepoly;

class Banks {
	double getRateOfInterest() {
		return 8.1;
	}
}

class SBI extends Banks {
	double getRateOfInterest() {
		return 8.4;
	}
}

class ICICI extends Banks {
	double getRateOfInterest() {
		return 8.8;
	}
}

class AXIS extends Banks {
	double getRateOfInterest() {
		return 9.1;
	}
}

class UNION extends Banks {

	//no methods defined for this bank	
}

public class BanksTest {
	public static void main(String args[]) {
		Banks b;
		b = new SBI();
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
		b = new AXIS();
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
		b = new UNION();
		System.out.println("Union Rate of Interest: "+b.getRateOfInterest());
	}
}