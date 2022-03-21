package loops;

public class BreakInForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		
		for(int j=1; j<=10; j++) {
			if(j==4) {
				continue;
			}
			System.out.println(j);
		}
		
		for(int k=1; k<=10; k++) {
			if(k==5) {
				System.out.println(k);
				continue;
			}
		}
		System.out.println("exit for loop");
	}
}