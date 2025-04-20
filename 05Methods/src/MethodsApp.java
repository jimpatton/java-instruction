import java.util.Scanner;

public class MethodsApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Methods\n");

		// add 2 numbers
		int x = promptInt("Enter number x: ");
		int y = promptInt("Enter number y: ");

		int sum = x + y;
		System.out.println("sum = " + sum);

		// divide 2 doubles
		// get 2 doubles, divide them, and print the result
		// create a method that called promptDouble

		double a = promptDouble("\nEnter number a: ");
		double b = promptDouble("Enter number b: ");
		double result = a / b;
		System.out.println("result a/b = " + result);

		sc.close();
		System.out.println("\nBye");
	}

	// use exception handling
	private static int promptInt(String prompt) {
		boolean isValid = false;
		int result = 0;
		while (!isValid) {
			try {
				System.out.print(prompt);
				result = Integer.parseInt(sc.nextLine());
				isValid = true;
			} catch (Exception e) {
				System.err.println("Error - invalid entry. Try again");
			}

		}
		return result;

	}

//use data validation
	private static double promptDouble(String prompt) {
		boolean isValid = false;
		double result = 0.0;
		while (!isValid) {
			System.out.println(prompt);
			if (sc.hasNextDouble()) {
				result = Double.parseDouble(sc.nextLine());
				isValid = true;
			} else {
				System.err.println("Error - invalid entry. Try again");
				sc.nextLine();
			}
		}
		return result;

	}

}
