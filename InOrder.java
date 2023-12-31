/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int currentNum = (int) (10 * Math.random()),
			prevNum = 0;
				
		do {
			prevNum = currentNum;
			System.out.print(currentNum + " ");
			currentNum = (int) (10 * Math.random());
		} while (currentNum >= prevNum);
	}
}
