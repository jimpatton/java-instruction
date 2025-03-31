import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		MyConsole.printHeader("Palindrome checker");
		// number must be a palindrome
		int nbr = 0;
		boolean palindrome = false;
		while (!palindrome) {
			System.out.print("\nEnter a number: ");
			nbr = scanner.nextInt();
			if (reversed(nbr)) {
				System.out.print("The number " + nbr + " is a palindrome.");
			} else {
				System.out.print("The number " + nbr + " is not a palindrome.");
			}
		}

	}

	private static boolean reversed(int nbr) {
		// reverse the number
		int reversed = 0;
		int original = nbr;
		while (nbr != 0) {
			int digit = nbr % 10;
			reversed = reversed * 10 + digit;
			nbr /= 10;
		}

		// check if the number is a palindrome
		if (original == reversed) {
			return true;
		} else {
			return false;
		}
	}
}
