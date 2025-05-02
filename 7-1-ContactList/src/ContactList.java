import java.util.Scanner;

import model.Contact;

public class ContactList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Contact List application");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("\nEnter first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter last name: ");
		String lastName = sc.nextLine();
		System.out.print("Enter email");
		String email = sc.nextLine();
		while (!isValidEmail(email)) {
			System.out.println("Error! Please enter valid email format");
			System.out.print("Enter email: ");
			email = sc.nextLine();
		}
		System.out.print("Enter phone number: ");
		String phone = sc.nextLine();
		while (!isValidPhone(phone)) {
			System.out.println("Error! Please use format xxx-xxx-xxxx");
			System.out.print("Enter phone number: ");
			phone = sc.nextLine();
		}
		Contact c1 = new Contact(firstName,lastName,email,phone);
		System.out.println(c1.displayContact());
		System.out.print("\nContinue? (y/n)");
		choice = sc.nextLine();
		
	}
		sc.close();
	}
	public static boolean isValidEmail(String email) {
		String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
		return email.matches(regex);
		
	}
	
	public static boolean isValidPhone(String phone) {
		String regex = "^\\d{3}-\\d{3}-\\d{4}$";
		return phone.matches(regex);
	}
}
