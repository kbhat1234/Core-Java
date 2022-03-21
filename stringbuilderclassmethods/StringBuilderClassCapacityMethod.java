package stringbuilderclassmethods;

public class StringBuilderClassCapacityMethod {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("Welcome to java programming");
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.length());
	}
}