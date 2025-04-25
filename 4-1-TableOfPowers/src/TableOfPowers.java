import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Squares and Cubes table");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter and integer: ");
			int nbr = sc.nextInt();
			sc.nextLine();
			System.out.println("\nNumber\tSquared\tCubed");
			System.out.println("======\t=======\t=====");
			for (int i = 1; i<=nbr; i++) {
			System.out.println(i +"\t\t" +(i*i)+ "\t\t" + (i*i*i));
			}
			System.out.print("\nContinue? (y/n) ");
			choice = sc.nextLine();
		}
		sc.close();

	}

}
