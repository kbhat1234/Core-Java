package oop;

//object and class: main outside the class

class Student1 {
	int id;
	String name;
}

public class StudentTest {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		System.out.println("Id is "+s1.id);
		System.out.println("Name is "+s1.name);
	}
}