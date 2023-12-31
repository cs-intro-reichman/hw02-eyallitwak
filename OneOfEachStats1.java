/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//input for amount of experiments
		int T = Integer.parseInt(args[0]),
			totalBodyCount = 0,
			famsOf2 = 0,
			famsOf3 = 0,
			famsOf4More = 0;
		
		for(int i=0; i < T; i++) {
			//flags for getting each gender
			boolean gotBoy = false,
					gotGirl = false;
				
			int bodyCount = 0;
		
			//as long as we dont have both a boy
			//and a girl, continue making babies
			while (!gotBoy || !gotGirl) {
				if (Math.random() < 0.5) {
					gotGirl = true;
				}
				else {
					gotBoy = true;
				}
			
				bodyCount++;
				totalBodyCount++;
			}
		
			if (bodyCount == 2)	famsOf2++;
			else if (bodyCount == 3) famsOf3++;
			else famsOf4More++;
			}
			
			double avg = (double) totalBodyCount / T;
			System.out.println("Average: " + avg + " children to get at least one of each gender.");
			System.out.println("Number of families with 2 children: " + famsOf2);
			System.out.println("Number of families with 3 children: " + famsOf3);
			System.out.println("Number of families with 4 or more children: " + famsOf4More);
			
			if (famsOf2 >= Math.max(famsOf3, famsOf4More)) {
				System.out.println("The most common number of children is 2.");
			} else {
				if (famsOf3 >= famsOf4More) {
					System.out.println("The most common number of children is 3.");
				} else {
					System.out.println("The most common number of children is 4 or more.");
				}
			}
			
	}
}
