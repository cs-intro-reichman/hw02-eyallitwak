/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//gets integer input
		int N = Integer.parseInt(args[0]),
				divisorSum = 1;
		//initializes response String
		String trueResponse = N + " is a perfect number since " + N + " = 1";
		
		//checks and sums all of N's divisors
		for (int i=2; i < N; i++) {
			if (N % i == 0) {
				trueResponse = trueResponse + " + " + i;
				divisorSum += i;
			}
		}
		
		//1 isn't prime so it isn't perfect
		if(N == divisorSum && N != 1)
			System.out.println(trueResponse);
		else
			System.out.println(N + " is not a perfect number");
	}
}
