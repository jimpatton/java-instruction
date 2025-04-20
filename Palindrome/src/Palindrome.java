import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		MyConsole.printHeader("Palindrome checker");
		// number must be a palindrome
		int x = 0;
		boolean palindrome = false;
		while (!palindrome) {
//			System.out.print("\nEnter a number: ");
			x = scanner.nextInt();
			//check if the number is a palindrome
			palindrome = isPalindrome(x);
			//print the result
			if (palindrome) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}

	}

	public static boolean isPalindrome(int x) {
		//convert the number to string
		String str = Integer.toString(x);
		//reverse the string
		String reversed = new StringBuilder(str).reverse().toString();
		//compare the original string with the reversed string
		if (str.equals(reversed)) {
			return true;
		} else {
			return false;
		
		
		}


	}
}
