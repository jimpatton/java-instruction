import java.util.ArrayList;
import java.util.List;

import model.HangmanWords;
import util.MyConsole;

public class Hangman {

	static String[] image = new String[7];

	public static void main(String[] args) {
		MyConsole.printHeader("Hangman");
		

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) 
		{
			HangmanWords hangmanWords = new HangmanWords();
			String theWord = hangmanWords.getRandomWord();
			String hiddenWord = hangmanWords.getHiddenWord(theWord);
			int incorrectGuesses = 0;
			boolean wordGuessed = false;
			List<String> lettersGuessed = new ArrayList<>();
		
			while (hiddenWord.indexOf("_") >= 0) 
			{
				hangmanWords.displayHiddenWord(hiddenWord);
				// guess a letter
				String guess = MyConsole.promptString("Letter guess: ");
				// resolve letter in hiddenWord or display msg incorrectGuess
				char[] chars = theWord.toCharArray();
				char[] hiddenChars = hiddenWord.toCharArray();
				
				if (theWord.indexOf(guess.charAt(0)) == -1) 
				{
					MyConsole.printLine("Incorrect guess");
					
				} 
				else 
				{
					for (int i = 0; i < chars.length; i++) 
					{
						if (guess.charAt(0) == chars[i]) 
						{
							hiddenChars[i] = guess.charAt(0);
						}
					}
					hiddenWord = String.valueOf(hiddenChars);
				}
				

			}
			choice = MyConsole.promptString("Play again? (y/n): ");
		}

		populateImage();

		for (int i = 0; i < image.length; i++) 
		{
			MyConsole.printLine(image[i]);
			MyConsole.printLine();
		}

		
		MyConsole.printLine("\nBye");
	}

	private static String getHangmanImage(int incorrectGuesses) 
	{
		return image[incorrectGuesses];
	}

	public static void populateImage() 
	{
		image[0] = """
				-----
				|   |
				|
				|
				|
				|
				-----
				""";
		image[1] = """
				-----
				|   |
				|   @
				|
				|
				|
				-----
				""";
		image[2] = """
				-----
				|   |
				|   @
				|  /
				|
				|
				-----
				""";
		image[3] = """
				-----
				|   |
				|   @
				|  /|
				|
				|
				-----
				""";
		image[4] = """
				-----
				|   |
				|   @
				|  /|\\
				|
				|
				-----
				""";
		image[5] = """
				-----
				|   |
				|   @
				|  /|\\
				|  /
				|
				-----
				""";
		image[6] = """
				-----
				|   |
				|   @
				|  /|\\
				|  / \\
				|
				-----
				""";

	}

}
