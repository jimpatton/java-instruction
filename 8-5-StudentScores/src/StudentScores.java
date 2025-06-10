import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Student;

public class StudentScores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The Student Scores Application\n");
		List <Student> students = new ArrayList<>();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) 
		{
			System.out.println("\nSTUDENT");
			System.out.print("Last name: ");
			String lastName = sc.nextLine();
			System.out.print("First Name: ");
			String firstName = sc.nextLine();
			System.out.print("Score: ");
			int score = sc.nextInt();
			sc.nextLine();
			Student student = new Student(lastName, firstName, score);
			students.add(student);
			
			System.out.print("/nEnter another student? (y/n): ");
			choice = sc.nextLine();			
			
		}
		
		System.out.println("\nSummary");
		for (Student student :students)
		{
			System.out.println(student.toString());
		}		
		
	}

}
