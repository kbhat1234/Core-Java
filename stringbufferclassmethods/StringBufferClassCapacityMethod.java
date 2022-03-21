package stringbufferclassmethods;

public class StringBufferClassCapacityMethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Welcome");
		System.out.println(sb.capacity());
		sb.append(" to java programming. enjoy the day");
		System.out.println(sb.capacity());
	}
}
