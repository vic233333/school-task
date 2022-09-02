public class ClimbInfo
{
  private String name;
  private int time;

  /** Creates a ClimbInfo object with name peakName and time climbTime.
   * @param peakName the name of the mountain peak
   * @param climbTime the number of minutes taken to complete the climb
   */
  public ClimbInfo(String peakName, int climbTime)
  {  time = climbTime; name = peakName;  }

  /** @return the name of the mountain peak
   */
  public String getName()
  {  return name;  }

  /** @return the number of minutes taken to complete the climb
   */
  public int getTime()
  {  return time;  }

  public String toString()
  {
    return name + " " + time;
  }
}
