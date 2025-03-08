import java.text.NumberFormat;

import util.MyConsole;

public class TipCalculator {

	public static void main(String[] args) {
		MyConsole.printLine("Tip Calculator\n");
		//while loop to continue
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		//prompt for costOfMeal
		double costOfMeal =	MyConsole.promptDouble("Cost of meal: ");
		//for loop to calculate tip at 15, 20, 25%
			for(double d = .15; d <=.25; d+=.05) {
				double percent = 0;
				NumberFormat tipPercent = NumberFormat.getPercentInstance();
				
				double tip = (costOfMeal * d);
				NumberFormat gratuity = NumberFormat.getCurrencyInstance();
				double totalAmount = costOfMeal + tip;
				NumberFormat total = NumberFormat.getCurrencyInstance();
				//print tip%, tipAmount, totalAmount
				MyConsole.printLine("\nPercent: "+tipPercent.format(d));
				MyConsole.printLine("Tip amount:\t\t" + gratuity.format(tip));
				MyConsole.printLine("Total amount:\t\t" + total.format(totalAmount));
			}
		
		choice = MyConsole.promptString("Continue? (y/n): ");
		
		}
		
		MyConsole.printLine("\nBye");
	}

}
