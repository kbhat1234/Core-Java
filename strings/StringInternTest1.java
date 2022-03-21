package strings;

public class StringInternTest1 {

	public static void main(String[] args) {
		String str1 = new String("Welcome to string methods in java programming");
		String str2 = new String("Welcome to string methods in java programming");
		System.out.println(str1==str2);
		
		String str3 = str1.intern();
		String str4 = str2.intern();
		System.out.println(str3==str4);
		
		String str5 = "This is a intern() string method";
		String str6 = "This is a intern() string method";
		System.out.println(str5==str6);
	}
}