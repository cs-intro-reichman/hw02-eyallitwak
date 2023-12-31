/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]),
			divisorSum = 1;
		String trueResponse = N + " is a perfect number since " + N + " = 1";
		
		for (int i=2; i < N; i++) {
			if (N % i == 0) {
				trueResponse = trueResponse + " + " + i;
				divisorSum += i;
			}
		}
		
		if(N == divisorSum && N != 1)
			System.out.println(trueResponse);
		else
			System.out.println(N + " is not a perfect number");
	}
}
