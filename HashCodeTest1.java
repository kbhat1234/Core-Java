
public class HashCodeTest1 {

	public static void main(String[] args) {
		System.out.println("Hashcode test using StringBuffer class");
		StringBuffer sBuffer = new StringBuffer("java");
		System.out.println(sBuffer.hashCode());
		sBuffer.append("Program");
		System.out.println(sBuffer.hashCode());
		sBuffer.append("written");
		System.out.println(sBuffer.hashCode());
		
		System.out.println("Hashcode test using StringBuilder class");
		StringBuilder sBuilder = new StringBuilder("java");
		System.out.println(sBuilder.hashCode());
		sBuilder.append("tpoint programming");
		System.out.println(sBuilder.hashCode());
		sBuilder.append("welcome to java programming");
		System.out.println(sBuilder.hashCode());

	}

}
