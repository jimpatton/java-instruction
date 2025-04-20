import java.util.Scanner;

public class CommonDivisor2 {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor 2\n");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// prompt for two numbers x and y
			System.out.print("Enter x: ");
			int x = Integer.parseInt(sc.nextLine());
			System.out.print("Enter y: ");
			int y = Integer.parseInt(sc.nextLine());
			// x = 12, y = 8
			// compute greatest common divisor
			// while x != 0
			// while y >= X
			// x stays the same, y = y - x
			// swap x and y(x = 8, y = 12)
			while (x != 0) {
				while (y >= x) {
					y -= x;
				}
				int hold = y;
				y = x;
				x = hold;
			}

			// print GCD
			System.out.println("\nGreatest Common Divisor: " + y);

			System.out.print("Continue (y/n): ");
			choice = sc.nextLine();
		}

		sc.close();
		System.out.println("\nBye");
	}

}
