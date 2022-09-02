import java.util.ArrayList;

public class Trip
{
  private ArrayList<Flight> flights;
    // stores the flights (if any) in chronological order

  public Trip() { flights = new ArrayList<Flight>(); }

  public void add(Flight f) { flights.add(f); }

  /*** Part (a) ***/

  /** @return the number of minutes from the departure of the first flight to the arrival
   *          of the last flight if there are one or more flights in the trip;
   *          0, if there are no flights in the trip
   */
  public int getDuration()
  {
   
  }

  /*** Part (b) ***/

  /** Precondition: the departure time for each flight is later than the arrival time of its
   *                preceding flight
   *  @return the smallest number of minutes between the arrival of a flight and the departure
   *          of the flight immediately after it, if there are two or more flights in the trip;
   *          -1, if there are fewer than two flights in the trip
   */
  public int getShortestLayover()
  {
    
  }
}
