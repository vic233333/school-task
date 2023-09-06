/* A2 */

public class SingleTable
{
  private int numSeats;
  private double viewQuality;
  private int height;
  
  public SingleTable(int n, double q, int h)
  {
    numSeats = n;
    viewQuality = q;
    height = h;
  }
  
  /** Returns the number of seats at this table. The value is always greater than or equal to 4. */
  public int getNumSeats()
  { return numSeats; }

  /** Returns the height of this table in centimeters. */
  public int getHeight()
  { return height; }

  /** Returns the quality of the view from this table. */
  public double getViewQuality()

  { return viewQuality; }

  /** Sets the quality of the view from this table to value. */
  public void setViewQuality(double value)
  { viewQuality = value; }
}