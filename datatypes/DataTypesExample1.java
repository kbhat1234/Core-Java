package datatypes;

public class DataTypesExample1 {

	public static void main(String[] args) {
		int a = 10;
		double b = 10.3;
		float c = 10.008f;
		String str = "My name is karthik";
		char ch = 'A';
		boolean bool1 = true;
		boolean bool2 = false;
		short s1=31999;
		long l1 = 2323435l;
		byte b1 = 122;
		byte b2 = -127;
		int [] arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(str);
		System.out.println(ch);
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(s1);
		System.out.println(l1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(arr.length);
		
		//to get the type of variable for non-primitive data type
		System.out.println(str.getClass().getSimpleName());
		System.out.println(arr.getClass().getSimpleName());
		System.out.println(str.getClass().getPackageName());
		System.out.println(arr.getClass().getPackageName());
		
		// to get type of variable for primitive data type
		System.out.println(((Object)a).getClass().getSimpleName());
		System.out.println(((Object)a).getClass().getPackageName());
		
		System.out.println(((Object)b).getClass().getSimpleName());
		System.out.println(((Object)c).getClass().getSimpleName());
		System.out.println(((Object)ch).getClass().getSimpleName());
		System.out.println(((Object)bool1).getClass().getSimpleName());
		System.out.println(((Object)s1).getClass().getSimpleName());
		System.out.println(((Object)l1).getClass().getSimpleName());
		System.out.println(((Object)b1).getClass().getSimpleName());
		System.out.println(((Object)b2).getClass().getSimpleName());
				
	}
}