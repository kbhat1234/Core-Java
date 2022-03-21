package stringbufferclassmethods;

public class StringBufferClassInsertMethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(", Hello");
		sb.insert(0, "Java 'StringBuffer' class");
		System.out.println(sb);
	}
}