import java.util.List;
import java.util.ArrayList;

public class SparseArray
{
  /** The number of rows and columns in the sparse array. */
  private int numRows;
  private int numCols;
  
  /**
   * The list of entries representing the non-zero elements of the sparse array. Entries are stored in the
   * list in no particular order. Each non-zero element is represented by exactly one entry in the list.
   */
  private List<SparseArrayEntry> entries;

  /** Constructs and empty sparse array. */  
  public SparseArray()
  {
    entries = new ArrayList<SparseArrayEntry>();
  }

  /** Returns the number of rows in the sparse array. */
  public int getNumRows()
  { return numRows; }

  /** Returns the number of columns in the sparse array. */
  public int getNumCols()
  { return numCols; }

  // Part (a)
  
  public int getValueAt(int row, int col)
  {
    
  }

  // Part (b)

  public void removeColumn(int col)
  {
    
  }



  /******************************************************************************/

  public SparseArray(int rows, int cols)
  {
    entries = new ArrayList<SparseArrayEntry>();
    numRows = rows;
    numCols = cols;
  }

  public void add(int row, int col, int value)
  { entries.add(new SparseArrayEntry(row, col, value)); }
  
  public String toString()
  {
    return getNumRows() + " " + getNumCols() + "\n" + entries;
  }
  
  public static void main(String[] args)
  {
    SparseArray sparse = new SparseArray(6, 5);
    sparse.add(1, 4, 4);
    sparse.add(2, 0, 1);
    sparse.add(3, 1, -9);
    sparse.add(1, 1, 5);
    
    System.out.println(sparse.getValueAt(3, 1));
    System.out.println(sparse.getValueAt(3, 3));

    System.out.println(sparse);
    sparse.removeColumn(1);    
    System.out.println(sparse);
  }  
}
