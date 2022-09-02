public class Flight
{
  private Time departure, arrival;

  public Flight(Time d, Time a) { departure = d; arrival = a; }

  /** @return time at which the flight departs
   */
  public Time getDepartureTime()
  { return departure; }

  /** @return time at which the flight arrives
   */
  public Time getArrivalTime()
  { return arrival; }
}