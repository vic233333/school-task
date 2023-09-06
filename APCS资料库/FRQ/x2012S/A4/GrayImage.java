public class GrayImage {
	public static final int BLACK = 0;
	public static final int WHITE = 255;

	/**
	 * The 2-dimensional representation of this image. Guaranteed not to be null.
	 * All values in the array are within the range [BLACK, WHITE], inclusive.
	 */
	private int[][] pixelValues;

	public GrayImage(int[][] pixels) {
		pixelValues = new int[pixels.length][];
		for (int r = 0; r < pixels.length; r++)
			pixelValues[r] = java.util.Arrays.copyOf(pixels[r], pixels[r].length);
	}

	// Part (a)

	/**
	 * @return the total number of white pixels in this image.
	 *         Postcondition: this image has not been changed.
	 */
	public int countWhitePixels() {
		int count = 0;
		for (int r = 0; r < pixelValues.length; r++) {
			for (int c = 0; c < pixelValues[0].length; c++) {
				if (pixelValues[r][c] == WHITE) {
					count++;
				}
			}
		}
		return count;
	}

	// Part (b)

	/**
	 * Processes this image in row-major order and decreases the value of each pixel
	 * at
	 * position (row, col) by the value of the pixel at position (row + 2, col + 2)
	 * if it exists.
	 * Resulting values that would be less than BLACK are replaced by BLACK.
	 * Pixels for which there is no pixel at position (row + 2, col + 2) are
	 * unchanged.
	 */
	public void processImage() {
		for (int r = 0; r < pixelValues.length - 2; r++) {
			for (int c = 0; c < pixelValues[0].length - 2; c++) {
				int temp = pixelValues[r][c] - pixelValues[r + 2][c + 2];
				if (temp < 0) {
					pixelValues[r][c] = BLACK;
				} else {
					pixelValues[r][c] = temp;
				}
			}
		}
	}

	public String toString() {
		String s = "";
		for (int[] row : pixelValues) {
			for (int x : row)
				s += String.format(" %3d", x);
			s += "\n";
		}
		return s;
	}
}