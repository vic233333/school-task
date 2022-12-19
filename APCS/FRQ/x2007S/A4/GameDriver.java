public class GameDriver {
	private GameState state; // the current state of the game

	public GameDriver(GameState initial) {
		state = initial;
	}

	/*** Part (b) ***/

	/**
	 * Plays an entire game, as described in the problem description
	 */
	public void play() {
		System.out.println(state.toString());
		while (state.isGameOver() != false) {
			Player player1 = state.getCurrentPlayer();
			String move = player1.getNextMove(state);
			System.out.println(player1.getName());
			System.out.println(move);
			state.makeMove(move);
		}
		Player winner = state.getWinner();
		if (winner == null) {
			System.out.println("Game ends in a draw");
		} else {
			System.out.println(winner.getName() + " wins");
		}
	}

}
