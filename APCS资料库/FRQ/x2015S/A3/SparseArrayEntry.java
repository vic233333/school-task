public class SparseArrayEntry
{
  /** The row index and the column index of this entry in the sparse array */
  private int row;
  private int col;

  /** The value of this entry in the parse array */
  private int value;

  /**
   * Constructs a SparseArrayEntry object that represents a sparse array element
   * with row index r and column index c, contaning value v.
   */       
  public SparseArrayEntry(int r, int c, int v)
  {
    row = r;
    col = c;
    value = v;
  }

  /** Returns the row index of this sparse array element */
  public int getRow()
  { return row; }

  /** Returns the column index of this sparse array element */
  public int getCol()
  { return col; }
  
  /** Returns the value of this sparse array element */
  public int getValue() { return value; }

  public String toString()
  {
    return "("+ row + ", " + col + ", " + value + ")";
  }
}
