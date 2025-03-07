import util.MyConsole;

public class StudentRegistration {

	public static void main(String[] args) {
		MyConsole.printLine("Student Registration Form\n");
		
		//prompt firstName, lastName, yearOfBirth
		//return welcome message and temp password
		
		String firstName = MyConsole.promptString("Enter first name: ");
		String lastName = MyConsole.promptString("Enter last name: ");
		String yearOfBirth = MyConsole.promptString("Enter year of birth: ");
		
		MyConsole.printLine("\nWelcome "+ firstName + " " + lastName);
		MyConsole.printLine("Your registration is complete.");
		MyConsole.printLine("Your temporary password is: "+firstName+"*"+yearOfBirth);
		
			

	}

}
