/* A4 */

public class LightBoard {
	/**
	 * The lights on the board, where true represents on and false represents off.
	 */
	private boolean[][] lights;

	/******************************** Part (a) ********************************/

	/**
	 * Constructs a LightBoard object having numRows rows and numCols columns.
	 * Precondition: numRows > 0, numCols > 0
	 * Postcondition: each light has a 40% probability of being set to on.
	 */
	public LightBoard(int numRows, int numCols) {
		lights = new boolean[numRows][numCols];
		for (int r = 0; r < lights.length; r++) {
			for (int c = 0; c < lights[0].length; c++) {
				int ran = (int) (Math.random() * 10);
				if (ran < 4) {
					lights[r][c] = true;
				} else {
					lights[r][c] = false;
				}
			}
		}
	}

	/******************************** Part (b) ********************************/

	/**
	 * Evaluates a light in row index row and column index col and returns a status
	 * as described in part (b).
	 * Precondition: row and col are valid indexes in lights.
	 */
	public boolean evaluateLight(int row, int col) {
		int count = 0;
		for (int r = 0; r < lights.length; r++) {
			if (lights[r][col] == true) {
				count++;
			}
		}
		if (lights[row][col] == true && count % 2 == 0) {
			return false;
		} else if (lights[row][col] == false && count % 3 == 0) {
			return true;
		} else {
			return lights[row][col];
		}
	}

	/* Test A4 */

	public String toString() {
		String s = "";
		for (int r = 0; r < lights.length; r++) {
			for (int c = 0; c < lights[0].length; c++)
				if (lights[r][c])
					s += "*";
				else
					s += ".";
			s += "\n";
		}
		return s;
	}

	public static void main(String[] args) {
		LightBoard sim = new LightBoard(7, 5);
		System.out.println(sim);
		System.out.println();

		String[] stars = {"**.**", "*..*.", "*..**", "*...*", "*...*", "**.**", "....."};
		boolean[][] lights = sim.lights;
		for (int r = 0; r < stars.length; r++)
			for (int c = 0; c < stars[0].length(); c++)
				lights[r][c] = stars[r].charAt(c) == '*';
		System.out.println(sim.evaluateLight(0, 3) + " " + sim.evaluateLight(6, 0) + " " +
				sim.evaluateLight(4, 1) + " " + sim.evaluateLight(5, 4));
	}
}