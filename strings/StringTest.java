package strings;

public class StringTest {

	public static void main(String[] args) {
		String msg1 = "Welcome to Java ";
		String msg2 = "Welcome to Python ";
		msg1="Java";
		
		System.out.println(msg1.charAt(3));
		System.out.println(msg1.compareTo(msg2));
		System.out.println(msg1.contains("come"));
		System.out.println(msg1.contains("come1"));
		System.out.println(msg1.concat(msg2));
		System.out.println(msg2.concat(msg1));
		System.out.println(msg1.endsWith("java"));
		System.out.println(msg1.toUpperCase());
		System.out.println(msg2.toLowerCase());
		System.out.println(msg1.length()+", "+msg2.length());
		System.out.println("Welcome to Java".concat(" Welcome to Python"));
		System.out.println(msg1+" "+msg2);
		System.out.println("Welcome to Java"+"Welcome to Python");
		
		char[] ch = {'W','E','L','C','O','M','E'};
		String str = new String(ch);
		System.out.println(str);
		System.out.println(msg1.replace('a', 'A'));
		
	}

}
