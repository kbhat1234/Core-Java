package strings;

public class StringTest2 {

	public static void main(String[] args) {
		String str1 = "     Selenium Automation Framework       ";
		String str2 = "Basic Java Tutorial";
		String str5 ="basic java tutorial";
		
		System.out.println(str2.startsWith("B"));
		System.out.println(str2.startsWith("Basic", 0));
		System.out.println(str2.endsWith("l"));
		System.out.println(str2.endsWith("ial"));
		
		System.out.println(str2.equalsIgnoreCase(str5));
		
		//compare 2 strings using equals() method
		System.out.println(str1.equals(str2)); //will return true or false
		System.out.println("Basic Java Tutorial".equals(str2));
		
		//return the single character at index value of the string
		System.out.println(str1.charAt(6));
		System.out.println("Basic Java Tutorial".charAt(7));
		
		//contains would return true if passed string is contained in given string
		System.out.println(str1.contains("Framework"));
		System.out.println("Basic Java Tutorial".contains("Java"));

		//indexOf() will return starting index of the passed string
		System.out.println(str1.indexOf("Framework"));
		
		//indexOf('a') will return the 1st index of the passed character 
		System.out.println(str2.indexOf('a'));
		
		//toLowerCase() method will all string to lower case
		System.out.println(str1.toLowerCase());
		
		//toUpperCase() method will all string to upper case
		System.out.println(str2.toUpperCase());
		
		String [] aSplit = str2.split("Java");
		System.out.println(aSplit[0]+", "+aSplit[1]);
		
		String subString = str1.substring(20);
		System.out.println(subString);
		
		subString = str1.substring(9, 19);
		System.out.println(subString);
		
		System.out.println(str1.trim());
		String str3="     ";
		System.out.println(str3.isEmpty());
		System.out.println(str1.isEmpty());
		System.out.println(str3.isBlank());
		
		System.out.println(str2.replace('a', 'A')); //char
		System.out.println(str2.replace("Java", "JAVA"));//charactersequence
		
	}
}