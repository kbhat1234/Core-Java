package statickeyword;

class StaticVariable {
	static String college = "NItte Institute of Technology";
	int id;
	String name;
	
	//StaticVariable(int i, String n){
		//id = i;
		//name = n;
	//}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(college);
	}
}

public class StaticVariableTest {

	public static void main(String[] args) {
		//StaticVariable s1 = new StaticVariable(1999,"Karthik");
		StaticVariable s1 = new StaticVariable();
		s1.id=1002;
		s1.name="karthik";
		System.out.println(s1.id+", "+s1.name+", "+StaticVariable.college);
		StaticVariable.college = "PESIT";
		s1.display();

	}

}
