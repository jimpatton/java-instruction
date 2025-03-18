import util.MyConsole;

public class TicTacToe {
	static String boardBorder = "+---+---+---+";
	static String[][] board = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };

	public static void main(String[] args) {
		MyConsole.printHeader("Tic Tac Toe");

//		 
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			boolean winner = false;
			// alternate between x and o
			displayBoard();
			// get user entry(position on board
			MyConsole.printLine("X's turn");
			int row = MyConsole.promptInt("Enter row (1,2,3): ", 1, 3);
			row--;
			int col = MyConsole.promptInt("Enter column (1,2,3): ", 1, 3);
			col--;
			if (board[row][col].isBlank()) {
				board[row][col] = "X";
			} else {
				// check to see if spot already taken
				MyConsole.printLine("Spot already taken, choose again");
				row = MyConsole.promptInt("Enter row (1,2,3): ", 1, 3);
				row--;
				col = MyConsole.promptInt("Enter column (1,2,3): ", 1, 3);
				col--;
			}
			displayBoard();// place x/o on board
			board[row][col] = "X";
			checkWinner();
			if (winner == true)
				break;

			MyConsole.printLine("O's turn");
			row = MyConsole.promptInt("Enter row (1,2,3): ", 1, 3);
			row--;
			col = MyConsole.promptInt("Enter column (1,2,3): ", 1, 3);
			col--;
			if (board[row][col].isBlank()) {
				board[row][col] = "O";
			} else {
				// check to see if spot already taken
				MyConsole.printLine("Spot already taken, choose again");
				row = MyConsole.promptInt("Enter row (1,2,3): ", 1, 3);
				row--;
				col = MyConsole.promptInt("Enter column (1,2,3): ", 1, 3);
				col--;
			}
			displayBoard();// place x/o on board
			board[row][col] = "O";
			// check for winner			
			winner = checkWinner();
			if (winner == true)
				break;

			// ask if they want to play again
			// if yes, reset board
			// if no, exit
			// if no winner, continue
			// if no winner and no more moves
			// display tie
			// check for tie

		}
		choice = MyConsole.promptString("Do you want to play again? (y/n): ");
	}
//		//simulation
//		//x in position 1,1
//		board[1][1] = "X";
//		displayBoard();				
//		//o in 0,2
//		board[0][2] = "0";
//		displayBoard();
//		//x in 0,0
//		board[0][0] = "X";
//		displayBoard();
//		//o in 1,2
//		board[1][2] = "0";
//		displayBoard();
//		
//		break;

	private static void displayBoard() {
		String boardString = boardBorder + "\n";
		// loop through rows
		for (int r = 0; r < board.length; r++) {
			// loop through columns
			boardString += "|";
			for (int c = 0; c < board[r].length; c++) {
				boardString += " " + (board[r][c]) + " |";
			}
			boardString += "\n" + boardBorder + "\n";
		}
		MyConsole.printLine(boardString);
	}

	public static boolean checkWinner() {
		boolean winner = false;
		// check rows
		for (int r = 0; r < board.length; r++) {
			if (!board[r][0].trim().isEmpty() && board[r][0].equals(board[r][1]) && board[r][1].equals(board[r][2])) {
				winner = true;
				MyConsole.printLine("Winner is " + board[r][0]);
			}
		}
		// check columns
		for (int c = 0; c < board[0].length; c++) {
			if (!board[0][c].trim().isEmpty() && board[0][c].equals(board[1][c]) && board[1][c].equals(board[2][c])) {
				winner = true;
				MyConsole.printLine("Winner is " + board[0][c]);
			}
		}
		// check diagonals
		if (!board[0][0].trim().isEmpty() && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
			winner = true;
			MyConsole.printLine("Winner is " + board[0][0]);
		}
		if (!board[0][2].trim().isEmpty() && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
			winner = true;
			MyConsole.printLine("Winner is " + board[0][2]);
		}
		return winner;
	}

}
