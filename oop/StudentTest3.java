package oop;
class Student3 {
	int id;
	String name;
	
	public Student3(){
		id = 0;
		name = null;
	}
	
	public Student3(int i, String n){
		id = i;
		name = n;
	}
	
	public Student3(String n, int i){
		name = n;
		id  = i;
	}
	
	public void displayRecord() {
		System.out.println("Id is "+id+", "+"Name is "+name);
	}
}

public class StudentTest3 {

	public static void main(String[] args) {
		Student3 s1 = new Student3();
		s1.displayRecord();
		
		Student3 s2 = new Student3(101,"Karthik");
		s2.displayRecord();
		
		Student3 s3 = new Student3("Rini",102);
		s3.displayRecord();
	}
}