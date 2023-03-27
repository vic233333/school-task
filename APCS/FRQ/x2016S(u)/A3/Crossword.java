public class Crossword {
	private Square[][] puzzle;

	/* Part (b) */

	public Crossword(boolean[][] blackSquares) {
		puzzle = new Square[blackSquares.length][blackSquares[0].length];
		int count = 1;
		for (int r = 0; r < puzzle.length; r++) {
			for (int c = 0; c < puzzle[0].length; c++) {
				if (blackSquares[r][c] == true) {
					puzzle[r][c] = new Square(true, 0);
				} else if (toBeLabeled(r, c, blackSquares) == false) {
					puzzle[r][c] = new Square(false, 0);
				} else {
					puzzle[r][c] = new Square(false, count);
					count++;
				}
			}
		}
	}
	/* Part (a) */

	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
		if (blackSquares[r][c] == true) {
			return false;
		} else {
			if (r == 0 || c == 0) {
				return true;
			} else {
				return blackSquares[r - 1][c] == true || blackSquares[r][c - 1] == true;
			}
		}
	}

	public Square getSquare(int r, int c) {
		return puzzle[r][c];
	}
}
