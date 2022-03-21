package copyconstructor;

public class CopyConstructorTest {
	
	int id;
	String name;
	
	//constructor to initialize id and name
	public CopyConstructorTest(int i, String n) {
		id = i;
		name = n;
	}
	
	//constructor to initialize another object
	public CopyConstructorTest(CopyConstructorTest c) {
		id = c.id;
		name = c.name;
	}
	
	public void display() {
		System.out.println(id+", "+name);
	}

	public static void main(String[] args) {		
		CopyConstructorTest c1 = new CopyConstructorTest(1002,"Karthik");
		CopyConstructorTest c2 = new CopyConstructorTest(c1);
		c1.display();
		c2.display();
	}

}
