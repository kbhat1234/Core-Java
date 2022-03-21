package arrays;

public class PassArrayMethod {

	public static void main(String[] args) {
		String [] aMake = {"BMW", "FIAT", "AUDI", "TOYOTA", "SUZUKI"};
		//calling print array method and passing an array as a parameter
		printArray(aMake);
	}
	
	//Accept array as argument of type String
	public static void printArray(String []arr) {
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
		}
	}
}