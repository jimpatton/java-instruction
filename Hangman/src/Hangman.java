import java.util.ArrayList;
import java.util.List;

import model.HangmanWords;
import util.MyConsole;

public class Hangman {

	static String[] image = new String[7];

	public static void main(String[] args) {
		MyConsole.printHeader("Hangman");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			HangmanWords hangmanWords = new HangmanWords();
			String theWord = hangmanWords.getRandomWord();
			String hiddenWord = hangmanWords.getHiddenWord(theWord);
			int incorrectGuesses = 0;
			boolean wordGuessed = false;
			List<String> lettersGuessed = new ArrayList<>();
			while (incorrectGuesses != 6 && !wordGuessed) {

				hangmanWords.displayHiddenWord(hiddenWord);
				MyConsole.printLine ("Letters Guessed: "+lettersGuessed.toString().replace("[", "").replace("]", ""));
				// guess a letter
				String letterGuess = MyConsole.promptString("Letter guess: ");
				// resolve letter in hiddenWord or display msg incorrectGuess
				lettersGuessed.add(letterGuess);
				lettersGuessed.sort(null);
				
				char[] chars = theWord.toCharArray();
				char[] hiddenChars = hiddenWord.toCharArray();

				if (theWord.indexOf(letterGuess.charAt(0)) == -1) {
					MyConsole.printLine("Incorrect guess");
					// increment incorrectguesses
					incorrectGuesses++;
					// display hangman image					
					MyConsole.print(populateImage(incorrectGuesses));										
					
					MyConsole.printLine("Incorrect guesses: " + incorrectGuesses);

				} else {
					for (int i = 0; i < chars.length; i++) {
						if (letterGuess.charAt(0) == chars[i]) {
							hiddenChars[i] = letterGuess.charAt(0);
						}
					}
					MyConsole.print(populateImage(incorrectGuesses));
					hiddenWord = String.valueOf(hiddenChars);
					// is the word guessed?
					// how many underscores are left in hiddenWord?
					if (hiddenWord.indexOf('_') == -1) {
						wordGuessed = true;
					}
					
				}

			}
			if (wordGuessed == true) {
				hangmanWords.displayHiddenWord(hiddenWord);
				MyConsole.printLine("Congratulations, you guessed the word "+theWord+"!");
			}
			else
				MyConsole.printLine("Sorry, the word was "+theWord);
			choice = MyConsole.promptString("Play again? (y/n): ");
		}
		MyConsole.printLine("\nBye");
	}



	public static String populateImage(int incorrectGuesses) {
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
		return image[incorrectGuesses];

	}

}
