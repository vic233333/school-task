public class Position
{
  private int row, col;

  /** Constructs a Position object with row r and column c. */
  public Position(int r, int c) {row = r; col = c; }

  public String toString() { return "("+ row + ", " + col + ")"; }
}
