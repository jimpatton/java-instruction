import java.util.Scanner;

public class TravelTimeCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator\n");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter miles:\t ");
		int miles = sc.nextInt();
		System.out.print("Enter miles per hour: ");
		int mph = sc.nextInt();
		double totalTime = miles/mph;
		int hours = (int)totalTime;
		double remainder = totalTime - hours;
		int minutes = (int)((remainder) * 60);
		
		System.out.println("\nEstimated travel time");
		System.out.println("---------------------");
		System.out.println("Hours: \t"+hours);
		System.out.println("Minutes:"+minutes);
		
		sc.nextLine();
		System.out.println("\nContinue? (y/n): ");
		choice = sc.nextLine();
				
					
		
		}
		System.out.println("\nBye");

	}

}
