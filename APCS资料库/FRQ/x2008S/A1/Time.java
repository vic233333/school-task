public class Time
{
  private int hour, mins;

  public Time(int h, int m) { hour = h; mins = m; }

  /** @return difference, in minutes, between this time and other;
   *          difference is negative if other is earlier than this time
   */
  public int minutesUntil(Time other)
  { return (other.hour - hour) * 60 + other.mins - mins; }
}