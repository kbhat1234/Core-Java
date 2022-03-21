package statickeyword;

class StaticMethod {
	static String college = "NMIT";
	static String city = "Karkala";
	int id;
	String name;
	
	public StaticMethod(int i, String n) {
		id = i;
		name = n;
	}
	
	public static void display() {
		System.out.println(college);
		System.out.println(city);
		//System.out.println(id); //static method cannot access non static data members
		//System.out.println(name);
		//show(); //cannot call non static method directly.
	}
	
	public static void change() {
		college="MVIT";
		city="Yelahanka";
	}
	
	public void show() {
		System.out.println(id);
		System.out.println(name);
	}
}

public class StaticMethodTest {

	public static void main(String[] args) {
		StaticMethod s1 = new StaticMethod(1001,"Karthik");
		StaticMethod.display();
		s1.show();
		StaticMethod.change();
		StaticMethod.display();
		s1.show();
	}
}