import java.io.Console;
import java.text.NumberFormat;

import util.MyConsole;

public class SalesReport {

	public static void main(String[] args) {
		MyConsole.printLine("The Sales Report application");
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double[][] sales = { { 1540.0, 2010.0, 2450.0, 1845.0 }, { 1130.0, 1168.0, 1847.0, 1491.0 },
				{ 1580.0, 2305.0, 2710.0, 1284.0 }, { 1105.0, 4102.0, 2391.0, 1576.0 } };

		double sum = 0.0;
		MyConsole.printLine("\nRegion\t\tQ1\t\tQ2\t\tQ3\tQ4");
		for (int i = 0; i < sales[0].length; i++) {
			MyConsole.print((i + 1) + "\t");
			for (int j = 0; j < sales[1].length; j++) {

				MyConsole.print(money.format(sales[i][j]) + "\t");
			}
			MyConsole.printLine();
		}
		// add sales by region
		MyConsole.print("\n\nSales by Region");
		for (int i = 0; i < sales[0].length; i++) {
			MyConsole.print("\nRegion " + (i + 1) + "\t");
			sum = 0.0;
			for (int j = 0; j < sales[i].length; j++) {
				sum += sales[i][j];
			}

			MyConsole.print(money.format(sum));
		}
		//add sales by quarter
		MyConsole.print("\n\nSales by Quater");
		for (int i = 0; i < sales[0].length; i++) {
			MyConsole.print("\nQuarter " + (i + 1) + "\t");
			sum = 0.0;
			for (int j = 0; j < sales[i].length; j++) {
	
				sum += sales[j][i];
			}
			MyConsole.print(money.format(sum));		
			
		}
		//total sales	
		sum = 0.0;
		MyConsole.print("\n\nTotal Sales: ");
		for (int i = 0; i < sales[0].length; i++) 
		{
			for(int j =0; j < sales[i].length; j++) 
			{				
				sum += sales [i][j];
			}
		}
		MyConsole.printLine(money.format(sum));
		
		
	}

}
