package strings;

public class StringInternMethod {

	public static void main(String[] args) {
		String str1 = new String("Welcome to java programming");
		String str2 = new String("Welcome to java programming");
		
		System.out.println(str1==str2);

		String str3 = "Welcome to python programming";
		String str4 = new String("Welcome to python programming");
		String str5 = str3;
		System.out.println(str3==str4);
		System.out.println(str3==str5);
		
		String s1 = "Javatpoint";
		String s2 = s1.intern();
		String s3 = new String("Javatpoint");
		String s4 = s3.intern();
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s3==s4);
	}

}
