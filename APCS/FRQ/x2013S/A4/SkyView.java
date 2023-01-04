public class SkyView {
	/**
	 * A rectangular array that holds the data representing a rectangular area of
	 * the sky.
	 */
	private double[][] view;

	// Part(a)

	/**
	 * Constructs a SkyView object from a 1-dimensional array of scan data.
	 * 
	 * @param numRows the number of rows represented in the view
	 *                Precondition: numRows > 0
	 * @param numCols the number of columns represented in the view
	 *                Precondition: numCols > 0
	 * @param scanned the scan data received from the telescope, stored in telescope
	 *                order
	 *                Precondition: scanned.length == numRows * numCols
	 *                Postcondition: view has been created as a rectangular
	 *                2-dimensional array
	 *                with numRows rows and numCols columns and the values in
	 *                scanned have been copied to view and are ordered as
	 *                in the original rectangular area of sky.
	 */

	/**
	 * 判断该行是否反向填充
	 * 推荐
	 */
	public SkyView(int numRows, int numCols, double scanned[]) {
		view = new double[numRows][numCols];
		int i = 0;
		for (int r = 0; r < view.length; r++) {
			// row start
			if (r % 2 == 0) {
				for (int c = 0; c < view[0].length; c++) {
					view[r][c] = scanned[i];
					i++;
				}
			} else {
				for (int c = view[0].length - 1; c >= 0; c--) {
					view[r][c] = scanned[i];
					i++;
				}
			}
			// row stop
		}
	}

	/**
	 * 实验一：row/col order for 2d
	 */
	public SkyView(int numRows, int numCols, double[] scanned) {
		view = new double[numRows][numCols];
		int i = 0;
		for (int c = 0; c < view[0].length; c++) {
			for (int r = 0; r < view.length; r++) {
				if (i < scanned.length) {
					view[r][c] = scanned[i];
					i++;
				}
			}
		}
	}

	// Part(b)
	// 实验二：for ld，换算法
	public SkyView(int numRows, int numCols, double[] scanned) {
		view = new double[numRows][numCols];
		int r, c;
		for (int i = 0; i < scanned.length; i++) {
			r = i / view[0].length;
			c = i % view[0].length;
			view[r][c] = scanned[i];
		}
	}

	/**
	 * 实验二for ld，换算法+蛇形填充
	 * 推荐
	 */ 
	public SkyView(int numRows, int numCols, double[] scanned) {
		view = new double[numRows][numCols];
		int r, c;
		for (int i = 0; i < scanned.length; i++) {
			r = i / view[0].length;
			c = i % view[0].length;
			if (r % 2 == 0) {
				view[r][c] = scanned[i];
			} else {
				view[r][numCols - 1 - c] = scanned[i];
			}
		}
	}

	// 实验二:for 1d，换算法+col order
	public SkyView(int numRows, int numCols, double[] scanned) {
		view = new double[numRows][numCols];
		int r, c;
		for (int i = 0; i < scanned.length; i++) {
			r = i % view.length;
			c = i / view.length;
			view[r][c] = scanned[i];
		}
	}

	/**
	 * Returns the average of the values in a rectangular section of view.
	 * 
	 * @param startRow the first row index of the section
	 * @param endRow   the last row index of the section
	 * @param startCol the first column index of the section
	 * @param endCol   the last column index of the section
	 *                 Precondition: 0 <= startRow <= endRow < view.length
	 *                 Precondition: 0 <= startCol <= endCol < view[0].length
	 * @return the average of the values in the specified section of view
	 */
	public double getAverage(int startRow, int endRow,
			int startCol, int endCol) {

	}

	/*******************************************************************************/

	public static void main(String[] args) {
		double[] scanned = { 0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9 };

		SkyView test = new SkyView(4, 3, scanned);

		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("%3.1f ", test.view[r][c]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Average = " + test.getAverage(1, 2, 0, 1));
	}
}