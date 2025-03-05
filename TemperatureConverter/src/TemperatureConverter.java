import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter\n");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter degrees in Fahrenheit: ");
		double degreesF = sc.nextDouble();
		double degreesC = (degreesF-32)* 5/9;
		System.out.println("Degrees in Celcius: "+((double)Math.round(degreesC*100)/100));
		
		sc.nextLine();
		System.out.print("Continue? (y/n) ");
		choice = sc.nextLine();

		
		
		
		
		
		
		
		
		
		}
		
		System.out.println("\nBye");
	}

}
