import java.text.NumberFormat;

import util.MyConsole;

public class InterestCalculator {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to the Interest Calculator");
		//while loop for Continue
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {		
		// prompt for loan amount: double
		double loan =MyConsole.promptDouble("Enter loan amount:\t ");
		NumberFormat loanAmount = NumberFormat.getCurrencyInstance();
		
		
		//prompt for interest rate: double
		double rate = MyConsole.promptDouble("Enter interest rate:\t ");
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(3);
		
		//calculate interest: loan * rate
		double interest = loan * rate;
		NumberFormat interestAmount = NumberFormat.getCurrencyInstance();

		//print loan amount in currency
		MyConsole.printLine("\nLoan amount:\t\t"+loanAmount.format(loan));;
		//print interest rate in percent to 3 decimal places
		MyConsole.printLine("Interest rate:\t\t"+percent.format(rate));
		//print interest in currency
		MyConsole.printLine("Interest:\t\t"+interestAmount.format(interest));

		choice = MyConsole.promptString("Continue? (y/n): ");
	}
	 MyConsole.printLine("\nBye");

}
	}
