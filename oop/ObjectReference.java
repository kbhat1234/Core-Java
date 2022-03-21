package oop;

class ReferenceObject {
	int id; //field or data member or instance variable
	String name;
}

public class ObjectReference {
	public static void main(String[] args) {
		ReferenceObject refobj1 = new ReferenceObject(); //creating object of ReferenceObject
		refobj1.id=101;//initializing objects using reference variable
		refobj1.name="Karthik Bhat";
		System.out.println("Id is "+refobj1.id+", Name is "+refobj1.name); //printing the data
		
		ReferenceObject refobj2 = new ReferenceObject();
		refobj2.id=102;//initializing objects using reference variable
		refobj2.name="Rini Das Bhat";
		System.out.println("Id is "+refobj2.id+", Name is "+refobj2.name); //printing the data
		
	}
}