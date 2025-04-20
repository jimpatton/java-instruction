import util.MyConsole;

public class MakeChocolate {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Make Chocolate");
		// given goal(kilos), #of big(5 kilos), #of small(1 kilo)
		// determine how many smallBars to use to hit the goal
		// goal - (big*5) = smallBars
		// if smallBars <= small
		// return small
		// else
		// return -1

		int smallBarsUsed = makeChocolate(4,1,9);
		MyConsole.printLine("small bars used = " +smallBarsUsed);
		
		smallBarsUsed = makeChocolate(4,1,10);
		MyConsole.printLine("small bars used = " +smallBarsUsed);
		
		smallBarsUsed = makeChocolate(4,1,7);
		MyConsole.printLine("small bars used = " +smallBarsUsed);
		
	}

	public static int makeChocolate(int small, int big, int goal) {
		int smallBars = goal - (big * 5);
		if (smallBars <= small) {
//			MyConsole.printLine("The number of small bars needed for goal is: " + smallBars);
		} else {
			smallBars = -1;
		}
		return smallBars;
	}
}
