package inheritanceconcepts;

class Employee {
	double salary = 150000;
}


public class Programmer extends Employee {
	int bonus = 25000;
	public static void main(String args[]) {
		Programmer p1 = new Programmer();
		System.out.println(p1.bonus);
		System.out.println(p1.salary);
		p1.bonus = 50000;
		p1.salary = 200000;
		System.out.println(p1.bonus);
		System.out.println(p1.salary);
	}
}