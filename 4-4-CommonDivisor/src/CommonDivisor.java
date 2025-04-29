import java.util.Scanner;

public class CommonDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Greatest Common Divisor Finder");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter first number: ");
			int x = sc.nextInt();
			System.out.print("Enter second number: ");
			int y = sc.nextInt();
			sc.nextLine();
			if (x>y) {
				int temp = x;
				x = y;
				y = temp;
			}
			for (;y != 0;) {
				int remainder = x % y;
				x = y;
				y = remainder;
			}
			System.out.println("Greatest common divisor: "+ x);
			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();
		}

	}

}
