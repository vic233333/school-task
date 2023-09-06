public class Square
{
  private boolean isBlack;
  private int num;

  /** Constructs one square of a crossword puzzle grid.
   * Postcondition:
   * - The square is black if and only if  isBlack is  true.
   * - The square has number  num.
   */
  public Square(boolean isBlack, int num)
  {
    this.isBlack = isBlack;
    this.num = num;
  }

  public boolean getIsBlack() { return isBlack; }
  public int getNumber() { return num; }

  public String toString()
  {
    String s;
    if (isBlack)
      s = "B";
    else
      s = "W";
    if (num == 0)
      s += "  ";
    else if (num < 10)
      s += num + " ";
    else
      s += num;
    return s;
  }
}
