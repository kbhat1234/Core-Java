package javaconversion;

class StringToInteger {
	
	public static void strToInt(String str) {
		System.out.println(Integer.parseInt(str));
		System.out.println(Integer.valueOf(Integer.parseInt(str)));
	}
}

class StringToLong {
	
	public static void strTolong(String str) {
		System.out.println(Long.parseLong(str));
		System.out.println(Long.valueOf(Long.parseLong(str)));
	}
}

class StringToFloat {
	
	public static void strToFloat(String str) {
		System.out.println(Float.parseFloat(str));
		System.out.println(Float.valueOf(Float.parseFloat(str)));
	}
}

class IntegerToString {
	public static void intToString(int i) {
		System.out.println(String.valueOf(i));
		System.out.println(Integer.toString(i));
	}
}

class LongToString {
	public static void longToString(long i) {
		System.out.println(String.valueOf(i));
		System.out.println(Long.toString(i));
	}
}

class FloatToString {
	public static void floatToString(float i) {
		System.out.println(String.valueOf(i));
		System.out.println(Float.toString(i));
	}
}

public class ConversionTest {

	public static void main(String[] args) {
		StringToInteger.strToInt("230");
		StringToLong.strTolong("5434535435435435");
		StringToFloat.strToFloat("1224");
		
		IntegerToString.intToString(10);
		LongToString.longToString(432424324);
		FloatToString.floatToString(12.55f);
	}
}