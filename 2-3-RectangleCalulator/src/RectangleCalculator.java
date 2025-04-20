import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Rectangle Area and Perimeter Calculator");
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter length: ");
			int l = sc.nextInt();
			System.out.print("Enter width: ");
			int w = sc.nextInt();
			sc.nextLine();
			//area = l*w
			//perimeter 2*(l+w)
			System.out.println("Area: " + (l*w));
			System.out.println("Perimeter: " + 2*(l+w));
			System.out.print("\nContinue ? (y/n): ");
			choice = sc.nextLine();
				
		}
		sc.close();

	}

}
