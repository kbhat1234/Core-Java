package arrays;

public class TestOneDimensionalArray {

	public static void main(String[] args) {
		int arr[] = new int[5]; //declaration and instantiation
		arr[0]=10; //initiatlization
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;

		//traversing array
		for(int i=0; i<arr.length; i++) { //length of the array
			System.out.println(arr[i]);
		}
	}
}