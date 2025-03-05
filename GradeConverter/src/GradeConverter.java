import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grade Converter\n");
		
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter numerical grade: ");
			int nbrGrade = sc.nextInt();
			String letterGrade = "";
			if (nbrGrade >= 88) {
				letterGrade = "A";
			}
			else if (nbrGrade >=80) {
				letterGrade = "B";
			}
			else if (nbrGrade >= 68) {
				letterGrade = "C";
			}
			else if (nbrGrade >= 60) {
				letterGrade = "D";
			}
			else 
				letterGrade = "F";
			
			System.out.println("Letter Grade: "+letterGrade);
			
						
			sc.nextLine();			
			System.out.println("\nContinue? (y/n)");
			choice = sc.nextLine();
		};
		
		
		System.out.println("\nBye");
	}

}
