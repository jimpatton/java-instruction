import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Registration Form");
		System.out.println();
		System.out.println("Enter first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter last name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter year of birth: ");
		int year = sc.nextInt();
		System.out.println();
		System.out.println("Welcome "+ firstName + " " + lastName +"!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is " +firstName+"*"+year);
		
				

	}

}
