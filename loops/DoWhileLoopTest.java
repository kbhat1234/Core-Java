package loops;

public class DoWhileLoopTest {

	public static void main(String[] args) {
		int i = 0;
		do {
			i = i + 5;
			System.out.println(i);
		}while(i<25);
		
		int j = 25;
		do {
			j = j + 5;
			System.out.println(j);
		}while(j<25);
	}
}