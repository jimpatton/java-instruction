import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("FizzBuzz Exercise");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) 
		{
			int nbr = getValidInt(sc,"\nEnter number: ");
			for (int i=1; i<=nbr; i++) 
			{
				if (i % 15 == 0) 
				{
					System.out.println("fizzbuzz");
				}
				else if (i % 5 == 0) 
				{
					System.out.println("buzz");
				}
				else if (i % 3 == 0) 
				{
					System.out.println("fizz");
				}
				else {
					System.out.println(i);
				}
			}
			System.out.println("\nContinue? (y/n): ");
			choice = sc.nextLine();				
		}
		sc.close();		
	}
	
	
	public static int getValidInt(Scanner sc, String prompt) {
		while (true) {
			System.out.println(prompt);
			String nbr = sc.nextLine();
			try {
				return Integer.parseInt(nbr);
			}
			catch (NumberFormatException e) {
				System.out.println("Error! Please enter a whole number");
			}
		}
	}

}
