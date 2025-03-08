import util.MyConsole;

public class DieRoller {

	public static void main(String[] args) {
		MyConsole.printLine("Dice Roller\n");
		// while loop: roll again?
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			//roll die 2 time call random class
			//total = die1 + die2
			int die1 = (int)(Math.random()*6)+1;
			int die2 = (int)(Math.random()*6)+1;
			int total = die1 + die2;
			MyConsole.printLine("Die 1: "+die1);
			MyConsole.printLine("Die 2: "+die2);
			MyConsole.printLine("Total: "+total);
			//if 2 "Snake eyes"
			//if 7 "Craps"
			//if 12 "Box cars"
			if (total == 2)
				MyConsole.printLine("Snake eyes!");
			else if (total == 7)
				MyConsole.printLine("Craps!");
			else if (total ==12)
				MyConsole.printLine("Box Cars!");
			
				
			
			
			
		choice = MyConsole.promptString("Continue? (y/n) ");	
		}
		
		MyConsole.printLine("\nBye");
			
	}

}
