package decisionmaking;

//switch case with case as string
public class SwitchCaseStatement {

	public static void main(String[] args) {
		String sDay = "MONDAY";
		
		switch(sDay) {
		case "Monday": case "monday": case "MONDAY":
			System.out.println("Today is Monday");
			break;
		case "Tuesday": case "tuesday": case "TUESDAY":
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday": case "wednesday": case "WEDNESDAY":
			System.out.println("Today is Wednesday");
			break;
		case "Thursday": case "thursday": case "THURSDAY":
			System.out.println("Today is Thursday");
			break;
		case "Friday": case "friday": case "FRIDAY":
			System.out.println("Today is Friday");
			break;
		default:
			System.out.println("It is an Weekend");
			break;		
		}
	}
}