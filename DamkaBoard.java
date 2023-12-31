/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		
		//outer for: responsible for row amount
		for (int i=0; i < N; i++) {
			//inner for: prints each row individually
			for (int j=0; j < N; j++) {
				if ( i % 2 == 0)
					System.out.print("* ");
				else
					System.out.print(" *");
			}
			System.out.println();
		}
	}
}
