import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Letter Grade Converter");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter numerical Grade: ");
			int numGrade = sc.nextInt();
			sc.nextLine();
			String letterGrade = "";
			if (numGrade >= 88) {
				letterGrade = "A";
			}
			else if (numGrade >=80) {
				letterGrade = "B";
			}
			else if (numGrade >= 68) {
				letterGrade = "C";
			}
			else if (numGrade >= 60) {
				letterGrade = "D";
			}
			else {
				letterGrade = "F";
			}
			
			System.out.println("Letter grade: " + letterGrade);
			
			
			System.out.print("\nContinue (y/n)? ");
			choice = sc.nextLine();
			
				
		}
		sc.close();
	}

}
