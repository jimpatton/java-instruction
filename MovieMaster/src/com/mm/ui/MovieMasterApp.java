package com.mm.ui;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import com.mm.db.DAO;

import com.mm.db.MovieDBDAO;
import com.mm.model.Movie;

import util.MyConsole;

public class MovieMasterApp {

//	private static DAO<Movie> movieDAO = new MovieFileDAO();
	private static DAO<Movie> movieDAO = new MovieDBDAO();
	private static List<String> ratings = new ArrayList <>(Arrays.asList("G", "PG", "PG-13", "R", "NC-17"));
	
	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Movie Master application");

		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = MyConsole.promptString("Enter Command: ");
			switch (command) {
			case "all":
				displayAllMovies();
				break;
			case "add":
				addMovie();
				break;
			case "del":
				deleteMovie();
				break;
			case "exit":
				break;
			default:
				MyConsole.printLine("Invalid Option. Try again.");
				break;
			}

		}

		MyConsole.printLine("\nBye");
	}

	private static void displayAllMovies() {
		MyConsole.printHeader("Display Movies:", "+");
		movieDAO.getAll().forEach(movie -> MyConsole.printLine(movie.toString()));
//		movieDAO.getAll().foreach(Movie::toString);
		
	}

	private static void addMovie() {
		MyConsole.printHeader("Add Movies:", "+");
		int id = MyConsole.promptInt("Movie Id: ");
		String title = MyConsole.promptString("Title: ");
		int year= MyConsole.promptInt("Year: ");
		String rating = MyConsole.promptString("Rating: ", ratings);
		String director = MyConsole.promptString("Director : ");
		movieDAO.add(new Movie(id, title, year, rating, director));
		MyConsole.printLine("Movie added.");
		
		
	}

	private static void deleteMovie() {
		MyConsole.printHeader("Delete Movies:", "+");
		int id = MyConsole.promptInt("Movie Id: ");
		movieDAO.delete(id);
		MyConsole.printLine("Movie deleted.");
		
	}

	private static void displayMenu() {
		MyConsole.printLine("Menu:");
		MyConsole.printLine("===================");
		MyConsole.printLine("all - Get All Movies");
		MyConsole.printLine("add - Add A Movie");
		MyConsole.printLine("del - Delete A Movie");
		MyConsole.printLine("exit");
	}

}
