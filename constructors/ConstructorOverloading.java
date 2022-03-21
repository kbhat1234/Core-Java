package constructors;

public class ConstructorOverloading {
	private int id;
	private String name;
	private int age;
	
	//2 argument constructor
	public ConstructorOverloading(int i, String n) {
		id = i;
		name = n;
	}
	
	//3 argument constructor
	public ConstructorOverloading(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	
	public void display() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("age is "+age);
	}
}