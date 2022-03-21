package stringbuilderclassmethods;

public class StringBuilderClassEnsureCapacityMethod {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("Welcome to programming");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.ensureCapacity(10);
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
		
	}

}
