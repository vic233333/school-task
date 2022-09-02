public class TimeInterval
{
  private int beginTime, endTime;

  public TimeInterval(int from, int to)
  {
    beginTime = from;
    endTime = to;
  }

  // returns true if interval overlaps with this TimeInterval;
  // otherwise, returns false
  public boolean overlapsWith(TimeInterval interval)
  {
    return !(beginTime >= interval.endTime || endTime <= interval.beginTime);
  }

  public String toString()
  { return beginTime + "-" + endTime; }
}
