package constructors;
class DefaultConstructor {
	int id;
	String name;
	
	public DefaultConstructor() {
		System.out.println("This is a default constructor");
	}
	
	public void display() {
		System.out.println("Id is "+id+", "+"Name is "+name);
	}
}

public class DefaultConstructorTest {

	public static void main(String[] args) {
		DefaultConstructor d1 = new DefaultConstructor();	
		d1.display();
	}

}
