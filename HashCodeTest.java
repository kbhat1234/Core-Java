
public class HashCodeTest {

	public static void main(String[] args) {
		
		System.out.println("Hashcode test using String class");
		String str = new String("java");
		System.out.println(str.hashCode());
		str = str + "tpoint";
		System.out.println(str.hashCode());
		str = str + " welcome to programming";
		System.out.println(str.hashCode());
		
		System.out.println("Hashcode test using StringBuffer class");
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb.hashCode());
		sb.append("tpoint programming");
		System.out.println(sb.hashCode());
		sb.append("welcome to java programming");
		System.out.println(sb.hashCode());
	}
}