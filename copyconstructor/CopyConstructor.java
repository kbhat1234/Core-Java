package copyconstructor;

public class CopyConstructor {
	
	int id;
	String name;
	
	public CopyConstructor() {
	}
	
	public CopyConstructor(int i, String n) {
		id = i;
		name = n;
	}
	
	public void display() {
		System.out.println(id+", "+name);
	}

	public static void main(String[] args) {
		CopyConstructor c1 = new CopyConstructor(1001,"Karthik");
		CopyConstructor c2 = new CopyConstructor();
		c1.display();
		c2.display();
		c2.id = c1.id;
		c2.name = c1.name;
		c2.display();
	}

}
