import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Tip Calculator");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nCost of Meal: ");
			double meal = sc.nextDouble();
			sc.nextLine();
			for (double d = .15; d<= .25; d += .05) {
				double tip = meal * d;
				double total = meal + tip;
				System.out.printf("\n %.0f%%\n",d * 100);
				System.out.printf("Tip amount: $%.2f\n", tip);
				System.out.printf("Total amount: $%.2f\n", total);
				
			}
			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();
		}	
		sc.close();
		
	}

}
