package datatypes;

public class VariablePlay1 {

	public static void main(String[] args) {
		
		float fl=10.234f;
		System.out.println(fl);
		
		int i1=(int)fl;
		System.out.println(i1);
		
		short s1 = 2882;
		System.out.println(s1);
		int i2 = (int)s1;
		System.out.println(i2);
		
		int i3 = 34234324;
		System.out.println(i3);
		System.out.println(((Object)i3).getClass().getSimpleName());
		long l1 = (long)i3;
		System.out.println(l1);
		System.out.println(((Object)l1).getClass().getSimpleName());
		
	}
}