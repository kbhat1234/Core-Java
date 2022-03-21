package decisionmaking;

public class IfSimpleStatement {

	public static void main(String[] args) {
		String sDay = "Friday";
		int iDay = 3;
		
		if(sDay.equalsIgnoreCase("SUNDAY")) {
			System.out.println("Today is Sunday");
		}
		
		if(iDay==7) {
			System.out.println("Today is Sunday");
		}
		System.out.println("end of program");
	}

}
