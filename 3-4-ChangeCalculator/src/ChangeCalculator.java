import java.util.Scanner;

public class ChangeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Change Calculator");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("\nEnter number of cents (0 - 99)");
		int cents = sc.nextInt();
		sc.nextLine();
		int quarters = cents / 25;
		cents = cents % 25;
		int dimes = cents / 10;
		cents = cents % 10;
		int nickels = cents / 5;
		cents = cents % 5;
		int pennies = cents;
		System.out.println("\nQuarters: " + quarters);
		System.out.println("Dimes:\t  " + dimes);
		System.out.println("Nickels:  " + nickels);
		System.out.println("Pennies:  " + pennies);
		System.out.print("\nContinue? (y/n)");
		choice = sc.nextLine();
	}
	sc.close();
	}
}
