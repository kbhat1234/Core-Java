package oop;
//object and class example: main within the class

//defining the Student class

class Student {
	//field or data member or instance variable
	int id; 
	String name;
	
	//creating main method inside the Student class
	public static void main(String[] args) {
		Student s1 = new Student(); //creating an object of Student
		//s1.id=101;
		//s1.name="Karthik Bhat";
		
		//printing values of object
		System.out.println("Id is "+s1.id); //accessing member through reference variable
		System.out.println("Name is "+s1.name);
	}
}