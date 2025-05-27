import util.MyConsole;

public class TicTacToe {
	static String boardBorder = "+---+---+---+";
	static String[][] board = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };

	public static void main(String[] args) {
		MyConsole.printHeader("Tic Tac Toe");

//		 
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			board = new String[][] { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
			boolean winner = false;
			while (!winner && !isBoardFull()) {
			// alternate between x and o
			displayBoard();
			// get user entry(position on board
			MyConsole.printLine("X's turn");
			boolean validMove = false;
			while (!validMove) {
			int row = MyConsole.promptInt("Enter row (1,2,3): ", 1, 3)-1;
//			row--;
			int col = MyConsole.promptInt("Enter column (1,2,3): ", 1, 3)-1;
//			col--;
			if (board[row][col].isBlank()) {
				board[row][col] = "X";
				validMove = true;
				
			} else {
				// check to see if spot already taken
				MyConsole.printLine("Spot already taken, choose again");
				row = MyConsole.promptInt("Enter row (1,2,3): ", 1, 3)-1;
//				row--;
				col = MyConsole.promptInt("Enter column (1,2,3): ", 1, 3)-1;
//				col--;
			}
			displayBoard();// place x/o on board
//			board[row][col] = "X";
			winner = checkWinner();
			if (winner) {
				break;
			}
			}
			 if (winner ||isBoardFull()) break; 
//			{
//				MyConsole.printLine("It's a tie!");
//				break;
//			}
			

			MyConsole.printLine("O's turn");
			validMove = false;
			while(!validMove) {
			int row = MyConsole.promptInt("Enter row (1,2,3): ", 1, 3);
			row--;
			int col = MyConsole.promptInt("Enter column (1,2,3): ", 1, 3);
			col--;
			if (board[row][col].isBlank()) {
				board[row][col] = "O";
				validMove = true;
			} else {
				// check to see if spot already taken
				MyConsole.printLine("Spot already taken, choose again");
				row = MyConsole.promptInt("Enter row (1,2,3): ", 1, 3)-1;
//				row--;
				col = MyConsole.promptInt("Enter column (1,2,3): ", 1, 3)-1;
//				col--;
			}
			displayBoard();// place x/o on board
//			board[row][col] = "O";
			// check for winner			
			winner = checkWinner();
			if (winner) {
				break;
			}
			}
			if (winner ||isBoardFull()) break;
//			{
//				MyConsole.printLine("It's a tie!");
//				break;
//			}
			

			
			// if no winner and no more moves
			// display tie
			// check for tie
			if (!winner || isBoardFull()) 
			{
				MyConsole.printLine("It's a tie!");
			}
			
			}
			choice = MyConsole.promptString("Do you want to play again? (y/n): ");
		}
	}


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
	
	public static boolean isBoardFull() 
	{
		for (int r = 0; r<board.length; r++) 
		{
			for (int c = 0; c<board[r].length; c++) 
			{
				if (board [r][c].isBlank())
				{
					return false;
				}
				}
		}
		return true;
	}
	
      
}

