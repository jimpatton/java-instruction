import java.util.Scanner;

import model.Grade;

public class GradeConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Letter Grade Converter");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) 
		{
			int grade = getNumGrade(sc,"\nEnter numerical grade: ",1,100);			
			String letterGrade = Grade.getLetterGrade(grade);
			System.out.println("Letter grade: " + letterGrade);
			System.out.print("\nContinue? (y/n):");
			choice = sc.nextLine();
		}
		
	}

	private static int getNumGrade(Scanner sc, String prompt, int min, int max) {
		int value =0;
		boolean isValid = false;
		while (!isValid) 
		{
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				value = sc.nextInt();
				sc.nextLine();
				if (value >= min && value <= max) {
					isValid = true;
				}
				else {
				System.out.println("Error! Please enter a number between " + min +" and " + max +".");
				}
			}
			else {
				System.out.println("Error! Please enter a whole number.");
				sc.nextLine();
			}
		}
		return value;
	}

}
