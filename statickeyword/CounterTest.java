package statickeyword;

public class CounterTest {
	
	static int count=0;
	CounterTest(){
		count++;
		System.out.println(count);
	}

	public static void main(String args[]) {
		CounterTest c1 = new CounterTest(), c2 = new CounterTest(), c3 = new CounterTest();
	}
}
