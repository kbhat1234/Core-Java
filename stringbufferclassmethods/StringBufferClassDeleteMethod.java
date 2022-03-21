package stringbufferclassmethods;

public class StringBufferClassDeleteMethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome to Java programming. enjoy the day");
		sb.delete(3, 7);
		System.out.println(sb);
	}
}