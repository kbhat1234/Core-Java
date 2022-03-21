package thiskeyword;

class Student {
	int id;
	String name;
	String course;
	double fee;
	
	public Student(int id, String name, String course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	public Student(int id, String name, String course, double fee) {
		this(id, name, course); //reusing constructor
		this.fee = fee;
	}
	
	public void display() {
		System.out.println(id+", "+name+", "+course+", "+fee);
	}
}

public class Test7 {

	public static void main(String[] args) {
		Student s1 = new Student(111,"Karthik","java");
		Student s2 = new Student(112,"Rini","Python",6000.33);
		s1.display();
		s2.display();
	}
}