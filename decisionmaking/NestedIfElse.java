package decisionmaking;

public class NestedIfElse {

	public static void main(String[] args) {
		String sDay = "Monday";
		int iDay = 1;
		
		if(sDay.equalsIgnoreCase("Sunday")) {
			System.out.println("Today is Sunday");
		} else if(sDay.equalsIgnoreCase("Saturday")) {
			System.out.println("Today is Saturday");
		}
		else {
			System.out.println("Today is Weekday");
		}
		
		if(iDay==7) {
			System.out.println("Today is Sunday");
		} else if(iDay==6) {
			System.out.println("Today is Saturday");
		} else {
			System.out.println("Today is Weekday");
		}
		
		System.out.println("end of program");
	}
}