package arrays;

//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//at arrays.ArrayIndexOutOfBoundsException.main(ArrayIndexOutOfBoundsException.java:8)

public class ArrayIndexOutOfBoundsException {

	public static void main(String args[]) {
		int arr[] = {10,20,30,40,50};
		for(int i=0; i<=arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}