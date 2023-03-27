import java.util.Arrays;

public class TokenPass {
	private int[] board;
	private int currentPlayer;

	// Part (a)

	/**
	 * Creates the board array to be of size playerCount and fills it with
	 * random integer values from 1 to 10, inclusive. Initializes currentPlayer to a
	 * random integer value in the range between 0 and playerCount-1, inclusive.
	 *
	 * @param playerCount the number of players
	 */
	public TokenPass(int playerCount) {
		board = new int[playerCount];
		for (int i = 0; i < board.length; i++) {
			board[i] = (int) (Math.random() * 10) + 1;
		}
		currentPlayer = (int) (Math.random() * playerCount);
	}

	// Part (b)

	/**
	 * Distributes the tokens from the current player's position one at a time to each player in
	 * the game. Distribution begins with the next position and continues until all the tokens
	 * have been distributed. If there are still tokens to distribute when the player at the
	 * highest position is reached, the next token will be distributed to the player at position 0.
	 * Precondition: the current player has at least one token.
	 * Postcondition: the current player has not changed.
	 */
	/* method 1*/
	public void distributeCurrentPlayerTokens() {
		int temp = board[currentPlayer];
		board[currentPlayer] = 0;
		int i = currentPlayer;
		while (temp > 0) {
			i = (i + 1) % board.length;
			board[i]++;
			temp--;
		}
	}

	/* method 2*/
	public void distributeCurrentPlayerTokens() {
		int temp = board[currentPlayer];
		board[currentPlayer] = 0;
		for (int i = currentPlayer + 1; i < temp + currentPlayer + 1; i++) {
			board[i % board.length]++;
		}
	}


	/*******************************************************************************/

	public static void main(String[] args) {
		TokenPass test = new TokenPass(4);
		System.out.println(Arrays.toString(test.board));
		System.out.println("Current player = " + test.currentPlayer);
		test.distributeCurrentPlayerTokens();
		System.out.println(Arrays.toString(test.board));
	}
}
