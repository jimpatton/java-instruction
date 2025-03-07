package ui;

import model.Actor;
import model.Movie;
import util.MyConsole;

public class BmdbConsoleApp {

	public static void main(String[] args) {
		MyConsole.printLine("Bmdb Console App\n");
		
		int id = MyConsole.promptInt("Enter Id: ");
		String title = MyConsole.promptString("Enter Title: ");
		int year = MyConsole.promptInt("Enter Year: ");
		String rating = MyConsole.promptString("Enter Rating: ");
		String director = MyConsole.promptString("Enter Director: ");
		Movie m1 = new Movie(id, title, year, rating, director);
	
		MyConsole.printLine(m1.toString());
		
		id = MyConsole.promptInt("\nEnter Id: ");
		String firstName = MyConsole.promptString("Enter First Name: ");
		String lastName = MyConsole.promptString("Enter Last Name: ");
		String gender = MyConsole.promptString("Enter Gender: ");
		String dateOfBirth = MyConsole.promptString("Enter Date of Birth: ");
		Actor a1 = new Actor(id,firstName, lastName, gender, dateOfBirth);
		
		MyConsole.printLine(a1.toString());
		
		
		
		
		
		MyConsole.printLine("\nBye");
				
	}

}
