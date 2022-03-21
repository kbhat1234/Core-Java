package statickeyword;

public class CounterTest1 {
	int count=0;
	CounterTest1(){
		count++;
		System.out.println(count);
	}
	public static void main(String args[]) {
		CounterTest1 c1 = new CounterTest1(), c2 = new CounterTest1(), c3 = new CounterTest1();
		
	}
}