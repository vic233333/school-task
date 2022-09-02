public class GrayImage
{
  public static final int BLACK = 0;
  public static final int WHITE = 255;

  /** The 2-dimensional representation of this image. Guaranteed not to be null.
   * All values in the array are within the range [BLACK, WHITE], inclusive.
   */
  private int[][] pixelValues;

  public GrayImage(int[][] pixels)
  {
    pixelValues = new int[pixels.length][];
    for (int r = 0; r < pixels.length; r++)
      pixelValues[r] = java.util.Arrays.copyOf(pixels[r], pixels[r].length);
  }

  // Part (a)

  /** @return the total number of white pixels in this image.
   *    Postcondition: this image has not been changed.
   */
  public int countWhitePixels()
  {
    
  }

  // Part (b)

  /** Processes this image in row-major order and decreases the value of each pixel at
   * position (row, col) by the value of the pixel at position (row + 2, col + 2) if it exists.
   * Resulting values that would be less than BLACK are replaced by BLACK.
   * Pixels for which there is no pixel at position (row + 2, col + 2) are unchanged.
   */
  public void processImage()
  {
    
  }



  public String toString()
  {
    String s = "";
    for (int[] row : pixelValues)
    {
      for (int x : row)
        s += String.format(" %3d", x);
      s += "\n";
    }
    return s;
  }
}