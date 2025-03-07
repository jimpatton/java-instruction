import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	static final int MIN_VAL = 1;
	static final int MAX_VAL = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("+++++++++++++++++++++++++++++++++++++");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("I'm thinking of a number between 1 and 100.");
			System.out.println("Try to guess it.");
			int nbr = (int) (Math.random() * 100) + 1;
			int count = 0;
			int guess = 0;

			while (guess != nbr) {

				System.out.println("\nEnter number: ");
				guess = Integer.parseInt(sc.nextLine());
				count++;
				if (guess == nbr) {
					System.out.println("You guessed it in " + count + " tries");
					if (count <= 3) {
						System.out.println("Great work! You are a mathematical wizard!");
					} else if (count <= 7) {
						System.out.println("Not too bad");
					} else {
						System.out.println("What took you so long? Maybe you should take some lessons.");
					}
				} else if (guess >= nbr + 10) {
					System.out.println("Way too high!");
				} else if (guess > nbr) {
					System.out.println("Too high");
				} else if (guess <= nbr - 10) {
					System.out.println("Way too low!");
				} else if (guess < nbr) {
					System.out.println("Too low");
				}

			}
			System.out.print("\n Try again? ");
			choice = sc.nextLine();

		}
		sc.close();
		System.out.println("\nBye - Come back soon!");
	}
}
