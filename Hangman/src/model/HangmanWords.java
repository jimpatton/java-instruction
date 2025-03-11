package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

import util.MyConsole;

public class HangmanWords {

	public List<String> words = new ArrayList<>();

	public HangmanWords() {
		super();
		words.add("happyhour");
		words.add("laptop");
		words.add("popcorn");
		words.add("waterballoon");
		words.add("meatball");
	}

	public HangmanWords(List<String> words) {
		super();
		this.words = words;
	}

	public List<String> getWords() {
		return words;
	}

	public void setWords(List<String> words) {
		this.words = words;
	}
	
	
	
	public String getRandomWord () 
	{
		
		Random random = new Random();
		String randomWord = words.get(random.nextInt(words.size()));
		return randomWord;		
	}
	
	public String getHiddenWord(String theWord) 
	{		
		String hiddenWord = "_".repeat(theWord.length());
		return hiddenWord;	
	}
	
	public void displayHiddenWord(String hiddenWord) 
	{
		// display hiddenWord with spaces
		String hiddenWordDisplay = "";
		char[] chars = hiddenWord.toCharArray();
		for (int i = 0; i < chars.length; i++) 
		{
			hiddenWordDisplay += chars[i] + " ";
		}
		MyConsole.printLine("\nHidden word display = " + hiddenWordDisplay + ".");
	}
	
	
}
