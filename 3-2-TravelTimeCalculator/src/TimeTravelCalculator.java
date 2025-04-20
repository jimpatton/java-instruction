import java.util.Scanner;

public class TimeTravelCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Time Travel Calculator");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
			System.out.print("\nEnter miles: ");
			int miles = sc.nextInt();
			System.out.print("Enter miles per hour: ");
			int mph = sc.nextInt();
			float time = (float) miles/mph;
			int hours = (int)time;
			float minutes = (time - hours)*60;
			System.out.println("\nEstimated Travel Time");
			System.out.println("----------------------");
			System.out.println("Hours: " + hours);
			System.out.println("Minutes: " + Math.round(minutes));
			System.out.print("\nContinue? (y/n): ");
			sc.nextLine();
			choice = sc.nextLine();				
		}
		sc.close();
		
	}
	

}
