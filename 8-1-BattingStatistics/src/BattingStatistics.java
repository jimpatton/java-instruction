import java.util.Scanner;

public class BattingStatistics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Batting Average Calculator");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) 
		{
			int atBat = 0;
			while (true) 
			{
				
				System.out.print("\nEnter number of times at bat: ");
				String atBatInput = sc.nextLine();
				try 
				{
					atBat = Integer.parseInt(atBatInput);
					if (atBat<1 || atBat>30) 
					{
						System.out.println("Error! Please enter a number between 1 and 30");
					}
					else 
					{
						break;
					}
				}
				catch (NumberFormatException e)
				{
					System.out.println("Error! Please enter a valid number between 1 and 30");
				}
			}			
			int[] stats = new int[atBat];
			System.out.println("\n0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
			for (int i = 0; i<atBat; i++) 
			{
				while (true) 
				{
					System.out.println("Result of at bat "+ (i+1)+ ": ");
					String resultInput = sc.nextLine();
					try 
					{
						int result = Integer.parseInt(resultInput);
						if (result<0||result>4) 
						{
							System.out.println("Error! Please enter a number between 0 and 4");
						}
						else 
						{
							stats[i] = result;
							break;
						}
					}
					catch (NumberFormatException e) 
					{
						System.out.println("Error! Please enter and integer between 0 and 4");
					}					
				}
			}
			
			int hits = 0;
			int bases = 0;
			for (int stat :stats) 
			{
				bases += stat;
				if (stat > 0) 
				{
					hits ++;
				}
			}
			double battAve = (double) hits/atBat;
			double slugPct = (double) bases/atBat;
			System.out.printf("\nBatting average: %.3f\n", battAve);
			System.out.printf("Slugging percent: %.3f\n", slugPct);
			System.out.println("\nAnother player? ");
			choice  = sc.nextLine();			
		}
		sc.close();

	}

}
