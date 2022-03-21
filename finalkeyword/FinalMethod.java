package finalkeyword;

class Final {
	
	public void display() {
		System.out.println("display() method");
	}
	
	public  void show() {
		System.out.println("show() method");
	}
}

public class FinalMethod extends Final{
	
	
	public void display() {
		System.out.println("display() in main method");
	}
	 
	public void show() { //compile-time error seen
		System.out.println("show() in main method");
	}
	
	public static void main(String[] args) {
		
		FinalMethod fm = new FinalMethod();
		fm.display();
		fm.show();

	}

}
