package constructors;

public class ConstructorOverloadingTest {

	public static void main(String[] args) {
		ConstructorOverloading ol1 = new ConstructorOverloading(1001,"Karthik Bhat");
		ConstructorOverloading ol2 = new ConstructorOverloading(1002,"Rini Das Bhat",41);
		ol1.display();
		ol2.display();
	}
}