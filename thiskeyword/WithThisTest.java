package thiskeyword;

class ThisKeyword {
	int id;
	String name;
	double fee;
	
	public ThisKeyword(int id, String name, double fee){
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	
	public void display() {
		System.out.println(id+", "+name+", "+fee);
	}
}

public class WithThisTest {
	public static void main(String args[]) {
		ThisKeyword this1 = new ThisKeyword(1000,"Karthik",23323.23);
		ThisKeyword this2 = new ThisKeyword(1001,"Rini",22323.23);
		this1.display();
		this2.display();
	}
	
}