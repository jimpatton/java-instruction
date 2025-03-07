import java.util.List;

import model.Contact;
import util.MyConsole;

public class ContactList {

	
	public static void main(String[] args) {
		MyConsole.printLine("Welcome to the Contact List application\n");
		//create class Contact to store data
		//while loop
			//prompt firstName, lastName, email, phoneNumber
			//call method from class to display
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String firstName = MyConsole.promptString("Enter first name: ");
			String lastName = MyConsole.promptString("Enter last name: ");
			String email = MyConsole.promptString("Enter email: ");
			String phoneNumber = MyConsole.promptString("Enter phone number: ");
			Contact c1 = new Contact(firstName, lastName, email, phoneNumber);
			
			MyConsole.printLine(c1.displayContact());
					
			choice = MyConsole.promptString("Continue? (y/n) ");
		}
		

	}

}
