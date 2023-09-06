public class CookieOrder
{
  private String variety;
  private int numBoxes;

  /** Constructs a new CookieOrder object. */
  public CookieOrder(String variety, int numBoxes)
  {
    this.variety = variety;
    this.numBoxes = numBoxes;
  }

  /** @return the variety of cookie being ordered
   */
  public String getVariety()
  {
    return variety;
  }

  /** @return the number of boxes being ordered
  */
  public int getNumBoxes()
  {
    return numBoxes;
  }

  public String toString()
  {
    return variety + " " + numBoxes;
  }
}