package class_objects;

class ClassObject {
	static int id;
	String name;
}

public class ClassObjectTest {

	public static void main(String[] args) {
		ClassObject obj1 = new ClassObject();
		ClassObject obj2 = obj1;
		ClassObject.id = 2423;
		obj1.name="Karthik";
		System.out.println(ClassObject.id);
		System.out.println(obj1.name);
		obj2.name="Rini";
		ClassObject.id=322;
		System.out.println(obj2.name);
		System.out.println(ClassObject.id);
	}
}