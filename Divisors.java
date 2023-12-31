/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int inputNum = Integer.parseInt(args[0]);
		
		for (int i=1; i <= inputNum; i++) {
			if ( inputNum % i == 0) {
				System.out.println(i);
			}
		}
	}
}
