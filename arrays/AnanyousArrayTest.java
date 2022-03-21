package arrays;

public class AnanyousArrayTest {

	public static void printArray(int arr[]) {
		for(int i:arr) {
			System.out.println(i);
		}
	}
	public static void main(String args[]) {
		printArray(new int[]{10,20,30,40,50});//passing anonymous array to method
 }
}