
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean gotBoy = false,
				gotGirl = false;
				
		int bodyCount = 0;
		
		while (!gotBoy || !gotGirl) {
			if (Math.random() < 0.5) {
				gotGirl = true;
				System.out.print("g ");
			}
			else {
				gotBoy = true;
				System.out.print("b ");
			}
			
			bodyCount++;
		}
		
		System.out.println("\nYou made it... and now you have " + bodyCount + " children.");
	}
}
