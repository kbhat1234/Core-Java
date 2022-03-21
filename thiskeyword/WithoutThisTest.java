package thiskeyword;

class ThisKeywordTest {
	int id;
	String name;
	double fee;
	
	public ThisKeywordTest(int i, String n, double f){
		id = i;
		name = n;
		fee = f;
	}
	
	public void display() {
		System.out.println(id+", "+name+", "+fee);
	}
}

public class WithoutThisTest {
	public static void main(String args[]) {
		ThisKeywordTest this1 = new ThisKeywordTest(1000,"Karthik",23323.23);
		ThisKeywordTest this2 = new ThisKeywordTest(1001,"Rini",22323.23);
		this1.display();
		this2.display();
	}
	
}