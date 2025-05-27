import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountryListManager {
	
	static List<String> items = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String command = "";
		while (!command.equals("3")) 
		{
		
		System.out.println("\nCountry List Manager\n");
		// DisplayMenu - set up method
		displayMenu();		
		//Prompt Command - menu number
		System.out.println("Enter menu number ");
		command = sc.nextLine().trim();
		//evaluate command - 1 List, 2 Add, 3 Exit
		switch (command) 
		{
		case "1":
			listCountries();
			break;
		case "2":
			addCountry();
			break;
		case "3":
			break;		
		}
		//sort list alphabetically
		
		}
	}
	
	public static void displayMenu() 
	{
		System.out.println("COMMAND MENU");
		System.out.println("1 - List countries");
		System.out.println("2 - Add a country");
		System.out.println("3 - Exit");
	}
	
	public static void listCountries() 
	{
		if (items.isEmpty()) 
		{
			System.out.println("No countries in list");		
		}
		else 
		{
			Collections.sort(items);
			for(String item : items) 
			{				
					System.out.println(item);					
			}	
		}
	}
	
	public static void addCountry() 
	{
		System.out.println("\nEnter country");
		String country = sc.nextLine();
		items.add(country);
		System.out.println(country + " has been added");
		
	}
}
