import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Welcome to the Temperature Converter");
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
		System.out.print("Enter degrees in Fahrenheit: ");
		float f = sc.nextFloat();
		sc.nextLine();
		//c = (f-32) * 5/9
		float c = (f-32) * 5/9;
		System.out.println("Degrees in Celsius: " + c);
		System.out.println("\nContinue? (y/n): ");
		choice = sc.nextLine();
		
		}
		sc.close();

	}

}
