import java.util.Scanner;

public class CommonDivisorCalculator {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter first number: ");
			int x = sc.nextInt();
			System.out.print("Enter second number: ");
			int y = sc.nextInt();
		
			if (x<y) {
				int temp = x;
				x = y;
				y = temp;
			}
			for (; y !=0;) {
				int remainder = x % y;
				x = y;
				y = remainder;
			}
			
			System.out.println("Greatest common divisor: "+x);
			
					
			sc.nextLine();
			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();
		}
		System.out.println("\nBye");
			
		}
		

		}
		
		
		
		
		
		
		
		
		
		

	

