
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//flags for getting each gender
		boolean gotBoy = false,
				gotGirl = false;
				
		int bodyCount = 0;
		
		//as long as we dont have both a boy
		//and a girl, continue making babies
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
