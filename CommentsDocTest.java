/**
 * 
 * @author kbhat
 * @version 1.0.0.1
 * @since 21-06-1979
 */
public class CommentsDocTest {
	/**
	 * {@code This is static get() method and do not have any parameters}
	 */
	public static void get() {
		System.out.println("This is get() method");
	}
	
	/**
	 * {@code This is a static calculate() method and have parameters}
	 * @param a integer input
	 * @param b integer input
	 * @return integer value adding a and b
	 */
	public static int calculate(int a, int b) {
		return a + b;
	}
	
	/**
	 * {@code This is a static display() method and do not have any parameters}
	 *
	 */
	public static void display() {
		System.out.println("This is display() method");
	}
	
	/**
	 * {@code This is a main() method and accepts String as arguments}
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		int sum =(calculate(10,20));
		System.out.println("The sum is "+sum);
		get();
		display();
	}
}

/*class CommentsDoc {

	public void get() {
		System.out.println("This is get() method");
	}
	
	public int calculate(int a, int b) {
		return a + b;
	}
	
	public void display() {
		System.out.println("This is display() method");
	}
}

public class CommentsDocTest {
	
	public static void main(String[] args) {
		CommentsDoc d = new CommentsDoc();
		d.calculate(10, 20);
		int sum = (d.calculate(10, 20));
		System.out.println(sum);
		d.get();
		d.display();
	}
}*/