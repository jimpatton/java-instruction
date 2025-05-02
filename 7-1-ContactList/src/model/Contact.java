package model;

public class Contact {
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	public Contact(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	
	public Contact() {
		super();
	}
	
//	public String displayContact() {
//		String displayStr = "-------------------------\n";
//		displayStr += "----Current Contact------\n";
//		displayStr += "-------------------------\n";
//		displayStr += String.format("Name:\t\t%s %s\nEmail Address:\t%s\nPhone Number:\t%s",firstName,lastName,email,phone);
//		displayStr += "-------------------------\n";
//		return displayStr;
//	}
	
	public String displayContact() {
	    return String.format(
	        "\n-----------------------------------\n" +
	        "---- Current Contact --------------\n" +
	        "-----------------------------------\n" +
	        "Name:\t\t%s %s\n" +
	        "Email Address:\t%s\n" +
	        "Phone Number:\t%s\n" +
	        "-----------------------------------\n",
	        firstName, lastName, email, phone
	    );
	}
	
	

}
