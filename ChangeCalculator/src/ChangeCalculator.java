import util.MyConsole;

public class ChangeCalculator {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to the Change Calculator\n");
		//While loop to continue
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			//prompt for number of cents
			int cents = MyConsole.promptInt("\nEnter number of cents: ");
			//quarters cents/25
			//cents % 25
			int quarters = cents / 25;
			cents = cents % 25;
			int dimes = cents / 10;
			cents = cents % 10;
			int nickels = cents / 5;
			cents = cents % 5;
			int pennies = cents;
			
			MyConsole.printLine("\nQuarters:\t"+quarters);
			MyConsole.printLine("Dimes:\t\t"+dimes);
			MyConsole.printLine("Nickels:\t"+nickels);
			MyConsole.printLine("Pennies:\t"+pennies);					
						
			choice = MyConsole.promptString("Continue? (y/n): ");
		}
		MyConsole.printLine("\nBye");	

	}

}
