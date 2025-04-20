package UI;

import java.util.ArrayList;
import java.util.List;

import Model.Contact;
import util.MyConsole;

public class ContactManagerNoLampdaApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to contact manager - lambda free");
		
		List<Contact> contacts = new ArrayList<>(); 
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		
		//show all contacts
		displayContacts(contacts, "All Contacts");
		
		//show contacts missing phone numbers
		List<Contact> contactsNoPhone = new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getPhone()==null) {
				contactsNoPhone.add(c);
			}
		}
		displayContacts(contactsNoPhone, "Contacts - No Phone");
		
		//show contacts missing email
		List<Contact> contactsNoEmail = new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getEmail()==null) {
				contactsNoEmail.add(c);
			}
		}
		displayContacts(contactsNoEmail, "Contacts - No Email");
		
		MyConsole.printLine("\nBye");
	}

	private static void displayContacts(List<Contact> contacts, String header) {
		MyConsole.printHeader(header, "-");
		for (Contact c : contacts) {
			MyConsole.printLine(c.toString());
		}
	}
	
	
}
