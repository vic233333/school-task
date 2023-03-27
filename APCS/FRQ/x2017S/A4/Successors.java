public class Successors {
	/** Returns the position of num in intArr;
	 * returns null if no such element exists in intArr.
	 * Precondition: intArr contains at least one row.
	 */
	/**************** Part (a) ****************/

	public static Position findPosition(int num, int[][] intArr) {
		for (int r = 0; r < intArr.length; r++) {
			for (int c = 0; c < intArr[0].length; c++) {
				if (intArr[r][c] == num) {
					return new Position(r, c);
				}
			}
		}
		return null;
	}

	/** Returns a 2D successor array as described in part (b) constructed from intArr.
	 * Precondition: intArr contains at least one row and contains consecutive values.
	 * Each of these integers may be in any position in the 2D array.
	 */
	/**************** Part (b) ****************/

	public static Position[][] getSuccessorArray(int[][] intArr) {
		Position[][] newArr = new Position[intArr.length][intArr[0].length];
		for (int r = 0; r < intArr.length; r++) {
			for (int c = 0; c < intArr[0].length; c++) {
				newArr[r][c] = findPosition(intArr[r][c], intArr);
			}
		}
		return newArr;
	}
}
