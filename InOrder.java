/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//generates a random integer
		int currentNum = (int) (10 * Math.random()),
			prevNum = 0;
		
		//prints currentNum, creates new random num
		//if the new number equals or higher, continue loop
		do {
			prevNum = currentNum;
			System.out.print(currentNum + " ");
			currentNum = (int) (10 * Math.random());
		} while (currentNum >= prevNum);
	}
}
