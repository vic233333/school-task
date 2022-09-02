public class NumberTile
{
  private int left, right, top, bottom;

  public NumberTile(int l, int r, int t, int b)
  {
    left = l;
    right = r;
    top = t;
    bottom = b;
  }

  /** Rotates the tile 90 degrees clockwise
   */
  public void rotate()
  {
    int temp = left;
    left = bottom;
    bottom = right;
    right = top;
    top = temp;
  }

  /** @return value at left edge of tile
   */
  public int getLeft()
  { return left; }

  /** @return value at right edge of tile
   */
  public int getRight()
  { return right; }

  public String toString()
  {
    return "[" + left + ", " + right + ", " + top + ", " + bottom + "]";
  }
}