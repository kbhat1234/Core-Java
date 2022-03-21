package decisionmaking;

public class NestedSwitchCase {

	public static void main(String[] args) {
		//C - CSE, E - ECE, M - Mechanical
		char branch = 'c';
		int collegeYear = 2;
		switch(collegeYear) {
		case 1:
			System.out.println("English, Maths, Science");
			break;
		case 2:
			switch(branch) {
			case 'C': case 'c':
				System.out.println("OS, Jave, Data Structure");
				break;
			case 'E': case 'e':
				System.out.println("Micro processors, electronic circuits");
				break;
			case 'M': case 'm':
				System.out.println("Mech drawing, Machine theory");
				break;
			}
			break;
		case 3:
			switch(branch) {
			case 'C': case 'c':
				System.out.println("Computer organization, Multimedia");
				break;
			case 'E': case 'e':
				System.out.println("Logic design, Microelectronics");
				break;
			case 'M': case 'm':
				System.out.println("Internal machines, Mech vibration");
				break;	
			}
			break;
		case 4:
			switch(branch) {
			case 'C': case 'c':
				System.out.println("Computer networks, Multimedia theory");
				break;
			case 'E': case 'e':
				System.out.println("Embedded systems, Image processing");
				break;
			case 'M': case 'm':
				System.out.println("Production tech, Thermal energy");
				break;
			}
			break;
		default:
			System.out.println("Invalid branch or year!!!!");
			break;
		}
	}
}