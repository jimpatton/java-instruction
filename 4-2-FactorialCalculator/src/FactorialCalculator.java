import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Factorial Calculator");
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter an integer that's greater than 0 and less than 10: ");
			int nbr = sc.nextInt();
			sc.nextLine();
			int factorial = 1;
			for (int i = 1; i<=nbr; i++) {
				factorial *=i;
						}
			System.out.println("The factorial of " + nbr + " is " + factorial);
			System.out.print("\nContinue? (y/n) ");
			choice = sc.nextLine();
			}
		sc.close();
	}

}
