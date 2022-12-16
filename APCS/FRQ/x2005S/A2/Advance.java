/*** Part (a) ***/

public class Advance extends Ticket {
	private int days;

	public Advance(int d) {
		days = d;
	}


	public double getPrice() {
		if (days <= 9) {
			return 40.0;
		} else {
			return 30.0;
		}
	}
}
