public class TripTest
{
  public static void main(String[] args)
  {
    Trip trip = new Trip();
    trip.add(new Flight(new Time(11, 30), new Time(12, 15)));
    trip.add(new Flight(new Time(13, 15), new Time(15, 45)));
    trip.add(new Flight(new Time(16, 0), new Time(18, 45)));
    trip.add(new Flight(new Time(22, 15), new Time(23, 0)));
    System.out.println(trip.getDuration() + " " + trip.getShortestLayover());
  }
}
