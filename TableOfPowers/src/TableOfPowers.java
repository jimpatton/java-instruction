import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table\n");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter an integer ");
			int nbr = sc.nextInt();
//			int nbrSq = nbr*nbr;
//			int nbrCb = nbr*nbr*nbr;
			System.out.println("Number\t\tSquared\t\tCubed");
			System.out.println("======\t\t=======\t\t=====");
			for (int i = 1; i<=nbr; i++) {
				System.out.println(i +"\t\t" + i*i + "\t\t" + i*i*i);
			}
			
			sc.nextLine();
			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();
			
		}
		
				System.out.println("\nBye");

	}

}
