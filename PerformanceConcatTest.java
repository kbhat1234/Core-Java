
public class PerformanceConcatTest {

	public static String concatWithString() {
		String str = new String("java");
		for(int i=0; i<10000; i++) {
			str = str + "tpoint";
		}
		return str;
	}
	
	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("java");
		for(int i=0; i<10000; i++) {
			sb.append("tpoint");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println(System.currentTimeMillis()-startTime+"ms");
		
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println(System.currentTimeMillis()-startTime+"ms");	
	}
}