package finalkeyword;

final class Demo {
	int id;
	String name;
}

public class FinalClassTest extends Demo {
	
	public void method1() {
		System.out.println("method1");
	}
	public static void main(String[] args) {
		FinalClassTest t1 = new FinalClassTest();
		Demo d = new Demo();
		d.id=20;
		d.name="karthik";
		System.out.println(d.id+", "+d.name);
		t1.id = 1001;
		t1.name = "Karthik";
		System.out.println(t1.id+", "+t1.name);
		t1.method1();
	}

}
