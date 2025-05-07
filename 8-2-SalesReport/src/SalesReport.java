import java.text.NumberFormat;
import java.util.Scanner;

public class SalesReport {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sales Report");
		double[][] sales =
			{ 
				{ 1540.0, 2010.0, 2450.0, 1845.0 }, 
				{ 1130.0, 1168.0, 1847.0, 1491.0 },
				{ 1580.0, 2305.0, 2710.0, 1284.0 }, 
				{ 1105.0, 4102.0, 2391.0, 1576.0 } 
			};
		double sum = 0.0;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println("\nRegion\t\tQ1\t\tQ2\t\tQ3\t\tQ4");
		for (int i = 0; i < sales.length; i++) 
		{
			System.out.print("Region "+(i+1) + "\t");
			for (int j = 0; j<sales[1].length; j++) 
			{
				System.out.print(currency.format(sales[i][j]) +"\t");
			}
			System.out.println();
		}
		//add sales by region
		System.out.println("\nSales by Region");
	
		for (int i = 0; i <sales.length; i++) 
		{
			sum = 0.0;
			for (int j = 0; j< sales[1].length; j++) 
			{
				sum += sales[i][j];
			}
			System.out.println("Region "+(i+1)+":\t"+currency.format(sum));
		}
		// add sales by quarter
		System.out.println("\nSales by Quarter");
		for(int i = 0; i<sales.length; i++) 
		{
			sum = 0.0;
			for (int j =0; j< sales [1].length; j++) 
			{
				sum += sales[j][i];
			}
			System.out.println("Quarter "+(i+1)+":\t"+currency.format(sum));
		}
		//total sales
		sum = 0.0;
		for(int i = 0; i < sales.length; i++) 
		{
			for (int j = 0; j <sales[i].length; j++) 
			{
				sum += sales[i][j];
			}
		}
		System.out.println("\nTotal Sales: "+currency.format(sum));

	}

}
