package stringbuilderclassmethods;

public class StringBuilderClassInsertMethod {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello ");
		sb.insert(6, "Java");
		System.out.println(sb);
	}
}