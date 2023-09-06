/* A2 */

public class CombinedTable {
	private SingleTable t1;
	private SingleTable t2;

	public CombinedTable(SingleTable t11, SingleTable t21) {
		t1 = t11;
		t2 = t21;
	}

	public boolean canSeat(int test) {
		int sum = 0;
		sum = t1.getNumSeats() + t2.getNumSeats() - 2;
		return sum >= test;
	}

	public double getDesirability() {

		if (t1.getHeight() == t2.getHeight()) {
			return (t1.getViewQuality() + t2.getViewQuality()) / 2.0;
		} else {
			return (t1.getViewQuality() + t2.getViewQuality()) / 2.0 - 10.0;
		}
	}


	/***************** Test *****************/

	public static void main(String[] args) {
		SingleTable t1 = new SingleTable(4, 60.0, 74);
		SingleTable t2 = new SingleTable(8, 70.0, 74);
		SingleTable t3 = new SingleTable(12, 75.0, 76);

		CombinedTable c1 = new CombinedTable(t1, t2);
		CombinedTable c2 = new CombinedTable(t2, t3);

		System.out.println(c1.canSeat(9) + " " + c1.canSeat(11) + " " + c1.getDesirability());
		System.out.println(c2.canSeat(11) + " " + c2.getDesirability());
		t2.setViewQuality(80);
		System.out.println(c2.getDesirability());
	}
}