import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println("FizzBuzz\n");
		
		Scanner sc = new Scanner(System.in);	
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("Enter a number:");
		int nbr = sc.nextInt();
		
		for (int i = 1; i<=nbr; i++) {
					
		if (i % 15==0 ) {
			System.out.println("fizzbuzz");
		}
		else if (i % 3 == 0) {
			System.out.println("fizz");
		}
		else if (i % 5 == 0) {
			System.out.println("buzz");
		}
		else
			System.out.println(i);
			
		}
		sc.nextLine();
		System.out.println("Continue? ");
		choice = sc.nextLine();
		}
		System.out.println("\nBye");

	}

}
