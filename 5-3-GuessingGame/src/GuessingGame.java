import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Guess the Number Game");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("\nI'm thinking of a number between 1 and 100.\nTry to guess it.");
			int nbr = (int)(Math.random()*100) +1;
			int count = 0;
			int guess = 0;
			while (guess !=nbr) 
			{
				guess = getValidInteger(sc,"\nEnter number: ",1,100);
				count ++;
				if (guess == nbr) {
					System.out.println("You guessed it in " + count + " tries.");
					if (count <3) {
						System.out.println("You are a mathematical wizard!");
					}
					else if (count <= 7){
						System.out.println("Not too bad! You've got some potential");
					}
					else if (count > 7){
						System.out.println("What took you so long?");
					}
				}
				else if (guess !=nbr) {
					if (guess >= nbr +10) {
						System.out.println("Way too high!");
					}
					else if (guess > nbr) {
						System.out.println("Too high!");
					}
					else if (guess <= nbr -10) {
						System.out.println("Way too low!");
					}
					else if (guess < nbr) {
						System.out.println("Too low!");
					}					
				}
				
			}
			System.out.print("\nPlay again? ");
			choice = sc.nextLine();			
			}
		sc.close();	
		
	}

	private static int getValidInteger(Scanner sc, String prompt, int min, int max) {
		int value =0;
		boolean isValid = false;
		while (!isValid) 
		{
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				value = sc.nextInt();
				sc.nextLine();
				if (value >= min && value <= max) {
					isValid = true;
				}
				else {
				System.out.println("Error! Please enter a number between " + min +" and " + max +".");
				}
			}
			else {
				System.out.println("Error! Please enter a whole number.");
				sc.nextLine();
			}
		}
		return value;
	}

}
