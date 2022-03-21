package oop;

class Student2 {
	int id;
	String name;
	
	public void insertRecord(int i, String n) {
		id = i;
		name = n;
	}
	
	public void displayRecord() {
		System.out.println("Id is "+id+", "+"name is "+name);
	}
}

public class StudentTest2 {

	public static void main(String[] args) {
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		
		s1.insertRecord(101, "Karthik Bhat");
		s2.insertRecord(102, "Rini Das Bhat");
		
		s1.displayRecord();
		s2.displayRecord();
	}
}