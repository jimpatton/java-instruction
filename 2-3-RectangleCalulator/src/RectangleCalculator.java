import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Rectangle Area and Perimeter Calculator");
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
//			System.out.print("\nEnter length: ");
			double l = getPositiveDouble(sc,"\nEnter length: ");
//			System.out.print("Enter width: ");
			double w = getPositiveDouble(sc,"Enter width: ");
//			sc.nextLine();
			//area = l*w
			//perimeter 2*(l+w)
			System.out.printf("Area: %.2f%n", (l*w));
			System.out.printf("Perimeter: %.2f%n", 2*(l+w));
			System.out.print("\nContinue ? (y/n): ");
			choice = sc.nextLine();
				
		}
		sc.close();

	}
	private static double getPositiveDouble(Scanner sc, String prompt) {
		double num = -1;
		while (true) {
			System.out.print(prompt);
			String input = sc.nextLine();
			try {
				num = Double.parseDouble(input);
				if (num >0) {
					break;
				}
				else {
					System.out.println("Error! Please enter a positive number.");
				}
			}
			catch (NumberFormatException e){
				System.out.println("Error! Please enter a numeric value.");
				
			}		
		}
		return num;
	}
	
}
