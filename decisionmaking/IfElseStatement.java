package decisionmaking;

public class IfElseStatement {

	public static void main(String[] args) {
		String sDay = "Monday";
		int iDay = 1;
		
		if(sDay.equalsIgnoreCase("SATURDAY")) {
			System.out.println("Today is Saturday");
		}
		else {
			System.out.println("Today is not Saturday");
		}

		if(iDay==6) {
			System.out.println("Today is Saturday");
		}
		else {
			System.out.println("Today is not Saturday");
		}
		
		System.out.println("end of program");
	}
}