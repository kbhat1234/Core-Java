package polymorphismconcepts;

class Bank {
	public int getRateOfInterest() {
		return 0;
	}
}

class Sbi extends Bank {
	public int getRateOfInterest() {
		return 8;
	}
}

class Icici extends Bank {
	public int getRateOfInterest() {
		return 7;
	}
}

class Axis extends Bank {
	public int getRateOfInterest() {
		return 9;
	}
}

public class BankTest {
	public static void main(String args[]) {
		Sbi sbi = new Sbi();
		System.out.println("SBI Rate of Interest is "+sbi.getRateOfInterest());
		Icici icici = new Icici();
		System.out.println("ICICI Rate of Interest is "+icici.getRateOfInterest());
		Axis axis = new Axis();
		System.out.println("AXIS Rate of Interest is "+axis.getRateOfInterest());
		
		Bank b;
		b = new Sbi();
		System.out.println(b.getRateOfInterest());
		
		b = new Icici();
		System.out.println(b.getRateOfInterest());
		
		b = new Axis();
		System.out.println(b.getRateOfInterest());
	}
}