import util.MyConsole;

import model.Grade;

public class GradeConverter2 {

	public static void main(String[] args) {
		MyConsole.printHeader("Letter Grade Converter 2");
		//While loop: Continue
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		//prompt for number grade
			int number = MyConsole.promptInt("Enter numerical grade: ");
			MyConsole.printLine("Letter grade: "+ Grade.getLetter(number));
		//call method for letterGrade
		
		
		
		
		choice = MyConsole.promptString("Continue? (y/n): ");
		}
		
		MyConsole.printLine("\nBye");
	}

}
