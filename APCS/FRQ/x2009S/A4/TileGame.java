import java.util.ArrayList;

public class TileGame {
	/**
	 * represents the game board; guaranteed never to be null
	 */
	private ArrayList<NumberTile> board;

	public TileGame() {
		board = new ArrayList<NumberTile>();
	}

	// Part (a)

	/**
	 * Determines where to insert tile, in its current orientation, into game board
	 *
	 * @param tile the tile to be placed on the game board
	 * @return the position of tile where tile is to be inserted:
	 * 0 if the board is empty;
	 * -1 if tile does not fit in front, at end, or between any existing tiles;
	 * otherwise, 0 = position returned = board.size()
	 */
	private int getIndexForFit(NumberTile tile) {
		if (board.size() == 0) {
			return 0;
		}
		if (tile.getRight() == board.get(0).getLeft()) {
			return 0;
		}
		if (tile.getLeft() == board.get(board.size() - 1).getRight()) {
			return board.size();
		}
		for (int i = 0; i < board.size() - 1; i++) {
			if (board.get(i).getRight() == tile.getLeft() && tile.getRight() == board.get(i + 1).getLeft()) {
				return i + 1;
			}
		}
		return -1;
	}

	// *************************************************

	// Part (b)

	/**
	 * Places tile on the game board if it fits (checking all possible tile orientations if necessary).
	 * If there are no tiles on the game board, the tile is placed at position 0.
	 * The tile should be placed at most 1 time.
	 * Precondition: board is not null
	 *
	 * @param tile the tile to be placed on the game board
	 * @return true if tile is placed successfully; false otherwise
	 * Postcondition: the orientations of the other tiles on the board are not changed
	 * Postcondition: the order of the other tiles on the board relative to each other is not changed
	 */
	public boolean insertTile(NumberTile tile) {
		for (int i = 0; i < 4; i++) {
			int temp = getIndexForFit(tile);
			if (temp != -1) {
				board.add(temp, tile);
				return true;
			}
			tile.rotate();
		}
		return false;
	}

	// *************************************************

	public String toString() {
		return board.toString();
	}

	public static void main(String[] args) {
		TileGame game = new TileGame();

		System.out.println(game.insertTile(new NumberTile(3, 4, 6, 3)) + " " + game.board);
		System.out.println(game.insertTile(new NumberTile(4, 3, 4, 7)) + " " + game.board);
		System.out.println(game.insertTile(new NumberTile(4, 2, 1, 3)) + " " + game.board);
		System.out.println(game.insertTile(new NumberTile(2, 9, 5, 2)) + " " + game.board);
		System.out.println(game.insertTile(new NumberTile(2, 2, 3, 5)) + " " + game.board);
		System.out.println(game.insertTile(new NumberTile(9, 7, 2, 2)) + " " + game.board);
		System.out.println(game.insertTile(new NumberTile(8, 2, 3, 9)) + " " + game.board);
	}
}
