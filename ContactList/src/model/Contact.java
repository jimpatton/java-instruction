package model;

public class Contact {

	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	
	public Contact(String firstName, String lastName, String email, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public Contact() {
		super();
	}
	
	public String displayContact() {
		String displayStr ="----------------------------------------\n";
		displayStr +="----Contact List------------------------\n";
		displayStr +="----------------------------------------\n";
		displayStr +="Name:\t\t "+ firstName + " " + lastName + "\nEmail Address:\t " + email +"\nPhone Number:\t "+ phoneNumber;
		displayStr +="\n----------------------------------------";
		return displayStr;	
		
	}
		
}
