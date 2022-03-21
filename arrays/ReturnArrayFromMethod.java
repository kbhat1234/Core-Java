package arrays;

public class ReturnArrayFromMethod {

	public static void main(String[] args) {
		String[] arr = returnArray();
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static String[] returnArray() {
		String[] array = {"BMW", "FIAT", "AUDI", "TOYOTA", "SUZUKI"};
		return array;
	}
}