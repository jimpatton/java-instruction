import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		System.out.println("Welcome to the Area Calculator");
		while (choice.equalsIgnoreCase("y")) 
		{
			System.out.println("\nCalculate the area of a circle, square, or rectangle? (c,s,r): ");
			String response = sc.nextLine();
			if (response.equals("c"))
				{
					System.out.println("\nCIRCLE:");
					System.out.print("Enter radius: ");
					double r = sc.nextDouble();
					double area = Math.PI * Math.pow(r, 2);
					System.out.println("Area: " + area);
				}
			else if (response.equals("s")) 
				{
					System.out.println("\nSQUARE:");
					System.out.print("Enter width: ");
					double w = sc.nextDouble();
					double area = Math.pow(w, 2);
					System.out.println("Area: " + area);
				}
			else if (response.equals("r")) 
				{
					System.out.println("\nRECTANGLE:");
					System.out.print("Enter width: ");
					double w = sc.nextDouble();
					System.out.print("Enter height: ");
					double h = sc.nextDouble();
					double area = w*h;
					System.out.println("Area: " + area);
				}
			else 
				{
					System.out.println("Invalid input. Enter c, s, or r.");
				}
			sc.nextLine();
			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();		
			
		}
		sc.close();

	}

}
