import java.util.ArrayList;

public class Trip {
	private ArrayList<Flight> flights;
	// stores the flights (if any) in chronological order

	public Trip() {
		flights = new ArrayList<Flight>();
	}

	public void add(Flight f) {
		flights.add(f);
	}

	/*** Part (a) ***/

	/**
	 * @return the number of minutes from the departure of the first flight to the arrival
	 * of the last flight if there are one or more flights in the trip;
	 * 0, if there are no flights in the trip
	 */
	public int getDuration() {
		if (flights.size() == 0) {
			return 0;
		} else {
			Time dt = flights.get(0).getDepartureTime();
			Time at = flights.get(flights.size() - 1).getArrivalTime();
			return dt.minutesUntil(at);
		}
	}

	/*** Part (b) ***/

	/**
	 * Precondition: the departure time for each flight is later than the arrival time of its
	 * preceding flight
	 *
	 * @return the smallest number of minutes between the arrival of a flight and the departure
	 * of the flight immediately after it, if there are two or more flights in the trip;
	 * -1, if there are fewer than two flights in the trip
	 */
	public int getShortestLayover() {
		if (flights.size() < 2) {
			return -1;
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < flights.size() - 1; i++) {
			int temp = flights.get(i).getArrivalTime().minutesUntil(flights.get(i + 1).getDepartureTime());
			if (temp < min) {
				min = temp;
			}
		}
		return min;
	}
}
