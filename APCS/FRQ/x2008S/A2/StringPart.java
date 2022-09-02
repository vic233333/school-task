public class StringPart
{
  private int start, length;

  /** @param start the starting position of the substring in a master string
   *  @param length the length of the substring in a master string
   */
  public StringPart(int start, int length)
  { this.start = start; this.length = length; }

  /** @return the starting position of the substring in a master string
   */
  public int getStart()
  { return start; }

  /** @return the length of the substring in a master string
   */
  public int getLength()
  { return length; }

  public String toString() { return "(" + start + ", " + length + ")"; }
}