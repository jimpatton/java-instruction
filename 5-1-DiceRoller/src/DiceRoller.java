import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dice Roller");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		Random rand = new Random();
		int d1 = rand.nextInt(6)+1;
		int d2 = rand.nextInt(6)+1;
		int total = d1 + d2;
		System.out.println("\nDie 1: " + d1);
		System.out.println("Die 2: " + d2);
		System.out.println("Total: " + total);
		if (total == 2){
			System.out.println("Snake eyes!");			
			}
		else if (total == 7) {
			System.out.println("Craps!");
		}
		else if (total == 12) {
			System.out.println("Box cars!");
		}
		System.out.print("\nRoll again? ");
		choice = sc.nextLine();		
		}
		sc.close();
	}

}
