package oop;
class Employee{
	int id;
	String name;
	double salary;
	
	public void insertEmployeeRecord(int i, String n, double s) {
		id = i;
		name = n;
		salary = s;
	}
	
	public void displayEmployeeRecord() {
		System.out.println("Emp id is "+id+", "+"Emp Name is "+name+", "+"Emp Salary is "+salary);
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.insertEmployeeRecord(101, "Karthik", 50000.44);
		e1.displayEmployeeRecord();
		Employee e2 = new Employee();
		e2.insertEmployeeRecord(102, "rini", 25000.33);
		e2.displayEmployeeRecord();
	}
}