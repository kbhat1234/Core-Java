package statickeyword;

class Student {
	int id;
	String name;
	static String college="NMIT";
	
	Student(int i, String n){
		id = i;
		name = n;
	}
	
	public void display() {
		System.out.println(id+", "+name+", "+college);
	}
}

public class StaticVariableTest1 {

	public static void main(String[] args) {
		Student s1 = new Student(1001,"Karthik");
		Student s2 = new Student(2333,"Rini");
		s1.display();
		s2.display();
		Student.college="PESIT";
		s1.display();
		s2.display();
	}
}