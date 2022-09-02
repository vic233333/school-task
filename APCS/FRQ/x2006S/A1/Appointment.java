public class Appointment
{
  private TimeInterval time;

  public Appointment(TimeInterval time)
  {
    this.time = time;
  }

  // returns the time interval of this Appointment
  public TimeInterval getTime() 
  {  return time; }

  /*** Part (a) ***/

  // returns true if the time interval of this Appointment
  // overlaps with the time interval of other;
  // otherwise, returns false
  public boolean conflictsWith(Appointment other)
  {
    
  }

  public String toString()
  { return time.toString(); }
}
