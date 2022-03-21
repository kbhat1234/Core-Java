/**
 * This program calculates the sum of 2 numbers
 * @author karthik
 * @version 10.0.1
 * @since 2019-06-21
 *
 */
public class Calculate {
	/**
	 *This method calculates and gives the sum of 2 numbers
	 *@param i is the first parameter to calculate() argument
	 *@param j is the second parameter to calculate() argument
	 *@return integer when done sum
	 */
	
	public int calculate(int i, int j) {
		return i + j;
	}
	
	/**
	 *This is a main() method.
	 *@param args without anything
	 *@see Exception
	 */
	public static void main(String args[]) {
		Calculate c1 = new Calculate();
		int result = c1.calculate(10, 20);
		System.out.println(result);
	}
}
