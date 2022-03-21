package stringbuilderclassmethods;

public class StringBuilderClassReplaceMethod {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.replace(2, 4, "karthik");
		System.out.println(sb);
	}
}