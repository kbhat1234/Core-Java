package arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		System.out.println(arr[0]);
		System.out.println("Length of array is " +arr.length);
		System.out.println(arr[3]);
		
		/***
		 * float[] arr1 = new float[5];
		arr1[0] = 20.2f;
		arr1[1] = 12.33f;
		arr1[2] = 33.4f;
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		String[] str = new String[5];
		str[0] = "BMW";
		str[1] = "FIAT";
		str[2] = "AUDI";
		str[3] = "HONDA";
		str[4] = "TOYOTA";
		System.out.println(str[3]);
		System.out.println(str[1]);
		*/
		
		String[] str1 = {"BMW", "FIAT", "AUDI", "HONDA", "TOYOTA"};
		System.out.println(str1[4]);		
		int len=str1.length;
		System.out.println(str1[len-3]);
		for(int i=0;i<=len-1;i++) {
			//System.out.println("The value stored at position "+i+" in str1 array is ==> "+str1[i]);
			System.out.println(i+" "+str1[i]);
		}
	}
}