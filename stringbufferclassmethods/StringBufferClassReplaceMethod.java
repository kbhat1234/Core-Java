package stringbufferclassmethods;

public class StringBufferClassReplaceMethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome to java programming. enjoy the day.");
		sb.replace(11, 15, "python");
		System.out.println(sb);

	}

}
