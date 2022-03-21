package strings;

public class StringTest1 {

	public static void main(String[] args) {
		char []ch = {'A','N','U','R','A','G'};
		String str = new String(ch);
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		String s1 = new String("Welocome to java programming ");
		String s2 = new String(s1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+" "+s2);
		System.out.println("Welocme to Java, "+"Enjoy the programming");
		System.out.println(s1.concat(s2));
		System.out.println(s2.concat(s1));
		
	}

}
