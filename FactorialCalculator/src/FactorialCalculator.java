import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("\nEnter an integer that's greater than 0 and less than 10: ");	
		long nbr = sc.nextLong();
		long factorial = 1;
		for (long i = 1; i<=nbr; i++) {
			factorial*=i;			
		}
		System.out.println("The factorial of "+nbr + " is "+factorial);
		
		sc.nextLine();
		System.out.print("Continue? (y/n): ");
		choice = sc.nextLine();
				
			
		}
		System.out.println(("\nBye"));

	}

}
