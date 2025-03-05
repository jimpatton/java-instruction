import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator\n");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter Length: ");
			int length = sc.nextInt();
			System.out.print("Enter width:");
			int width = sc.nextInt();
			int area = length * width;
			int perimeter = (2*length) + (2*width);
			System.out.println("Area: "+area);
			System.out.println("Perimeter: "+perimeter);
			
			sc.nextLine();
			System.out.print("\nContinue? (y/n)");
			choice = sc.nextLine();
		}
			
			
			System.out.println("\nBye");
						
			
		}
				

	}


