/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String inputTxt = args[0], outputTxt = "";
		
		for (int i = inputTxt.length() - 1; i >= 0; i--) {
			outputTxt = outputTxt + inputTxt.charAt(i);
		}
		
		int midIndex = inputTxt.length() / 2;
		char middle = outputTxt.charAt(midIndex);
		System.out.println(outputTxt);
		System.out.println("The middle character is " + middle);
	}
}
